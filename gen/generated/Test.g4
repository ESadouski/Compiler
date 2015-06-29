grammar Test;

options {
    language = Java;
    }

@header {
    import main.handle.MemoryHandler;
    import main.handle.GrabParser;
    import main.model.*;
    }

@members {
    private MemoryHandler handler = new MemoryHandler();
    private GrabParser parser = new GrabParser();
    }



program
    :   'program' {parser.prepareFiles();}

        'start'

            (variable | expression | statement | function | procedure | function_call | print)*


        'finish' {parser.closeFiles();}{handler.test();}
    ;

variable
    : type name     {handler.addVar(new Variable($name.text, $type.text, handler.scope));}
     ' = '? (value       {handler.getVarByName($name.text).setValue($value.val); handler.getVarByName($value.val);}
          | expression  {handler.getVarByName($name.text).setValue($expression.val);}
          | function_call {handler.getVarByName($name.text).setValue($function_call.val);}
    )?
    (', ' name          {handler.addVar(new Variable($name.text, $type.text, handler.scope));}
    ' = '? (value       {handler.getVarByName($name.text).setValue($value.val);}
          | expression  {handler.getVarByName($name.text).setValue($expression.val);}
          | function_call {handler.getVarByName($name.text).setValue($function_call.val);}
    )?
    )* ';' {parser.writeVariables(handler.scope);}
    ;

type
    :   ('int' | 'String' )
    ;

name
    :   STRING
    ;

value returns[String val, String typeOfVal]
    :   ('"' STRING'"'   {$val = "\"" + $STRING.text + "\""; $typeOfVal = "String";}
    |   INT                     {$val = $INT.text; $typeOfVal = "Int";}
    |   STRING                  {$val = $STRING.text; $typeOfVal = "Var";}
    )
    ;


//-------------------

expression returns[String val]
    :  s1=value {$val = $s1.text;}
    ( MATH_SYMB (s2=value)*
                                    {if ($s2.text!=null) {
                                         if ($s1.typeOfVal.equals("String")){
                                            $val = $val + parser.getMathSign("String", $MATH_SYMB.text, $val, $s2.text);
                                            } else {
                                            $val = $val + " " + parser.getMathSign("Int", $MATH_SYMB.text, $val, $s2.text);
                                            }

                                         } else {$val = $val + " " + $MATH_SYMB.text;
                                         }}
    )*
    ;

relation returns[String strValF, String strValS, String typeOfValue, String sign]
	:	v1=value
	(('==' {$sign="==";}
	| '!=' {$sign="!=";}
	| '<' {$sign="<";}
	| '<=' {$sign="<=";}
	| '>=' {$sign=">=";}
	| '>' {$sign=">";})
	 v2=value {$strValF = $v1.val; $strValS = $v2.val;}
	)*
	;

//-------------------------------

statement
    :   ifstatement
    |   whilestatement
    |   forstatement
    ;

ifstatement
    :   'if' '(' relation {parser.makeRelationHeader($relation.strValF, $relation.strValS, "if", handler.scope);}
     ')'
        (variable
        | expression
        | function_call
        | statement
        | print
         ';' {parser.makeRelationBody($expression.val, handler.scope);} )*
        ('else'
         variable
                 | expression
                 | function_call
                 | statement
                 | print
         ';' {parser.makeRelationBody(" } else {" + $expression.val + " }", handler.scope);})*
        'endif'
    ;


whilestatement
    :   'while' '(' relation {parser.makeRelationHeader($relation.strValF, $relation.strValS, "while", handler.scope);}')'
        (
         variable
                 | expression
                 | function_call
                 | statement
                 | print
         ';' {parser.makeRelationBody($expression.val, handler.scope);})*
        'endwhile' {parser.closeRelation(handler.scope);}
    ;

forstatement
    :   'for' '(' {parser.makeLoopHeader(handler.scope);} variable ';'* relation ';' expression ')'
        {parser.makeLoopHeaderParams($relation.strValF, $relation.sign, $relation.strValS, $expression.val, handler.scope);}
        (
         variable
                 | expression {parser.makeRelationBody($expression.val, handler.scope);}
                 | function_call
                 | statement
                 | print
         ';' )*
        'endfor' {parser.closeRelation(handler.scope);}
    ;

//-------------
    procedure
    	:	'procedure' name {handler.scope = $name.text;}
    	    '(' parameters? ')' {parser.makeProcedureHeader($name.text, $parameters.val);}
    		(variable
                     | expression
                     | function_call
                     | statement
                     | print)*
    		'end' {parser.closeProcedure();} {handler.scope = "global";}
    	;


    function returns[String val]
    	:	'function' type name {handler.scope = $name.text;}
    	    '(' parameters? ')' {parser.makeFuncHeader($type.text + " " + $name.text, $parameters.val);}
    		(variable
                     | expression
                     | function_call
                     | statement
                     | print)*
    		'return' expression ';' {parser.closeFunc($expression.val);} {handler.scope = "global";}
       	;

    function_call returns[String val]
        : name '(' parameters? ')' ';' {parser.makeFuncCall($name.text, $parameters.val, handler.scope);
                                             $val=$name.text + " (" +  $parameters.val + ")";}
        ;

    parameters returns[String val]
    	:	p1=parameter {$val = $p1.val;}
    	(',' p2=parameter {$val = $val + ","+ $p2.val;})*
    	;

    parameter returns[String val]
    	:	(type {$val = $type.text + " ";})* name { if($val ==null) {
    	                                                                  $val = $name.text;
    	                                                                  } else $val = $val + $name.text;}
    	;

    print
        : 'print' '(' expression ')' {parser.print(handler.scope, $expression.val);}
        ;




    MATH_SYMB :('+' | '-' | '/' | '*' | '=' | '+=' | '-=' | '++' | '--');
    STRING : ([a-z] | [A-Z])+;
    INT : [0-9]+;
    WORD : 'a'..'z'+;
    WS : (' ' | '\t' | '\n' | '\r' | '\t')* -> skip;
    SYMB : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;