grammar Test;

options {
    language = Java;
    }

@header {
    import main.handle.GrammaHandler;
    import main.handle.SadouskiParser;
    import main.model.*;
    }

@members {
    private GrammaHandler handler = new GrammaHandler();
    private SadouskiParser parser = new SadouskiParser();
    }



program
    :   'program' WS*

        'start' WS*

            (variable | expression | statement)* WS*


        'finish'
    ;

variable
    : type WS+ name     {handler.addVar(new Variable($name.text, $type.text, handler.scope));}
    ' = '? (value       {if (handler.getVarByName($name.text).getType().equals("int")) {
                            handler.getVarByName($name.text).setValue($value.intVal);
                            }
                         else {
                            handler.getVarByName($name.text).setValue($value.strVal);
                         }
                        }
          | expression  {if (handler.getVarByName($name.text).getType().equals("int")) {
                            handler.getVarByName($name.text).setValue($expression.intVal);
                            }
                         else {
                         handler.getVarByName($name.text).setValue($expression.strVal);
                         }
                        }
    )?
    (', ' name          {handler.addVar(new Variable($name.text, $type.text, handler.scope));}
    ' = '? (value       {if (handler.getVarByName($name.text).getType().equals("int")) {
                             handler.getVarByName($name.text).setValue($value.intVal);
                             }
                        else {
                        handler.getVarByName($name.text).setValue($value.strVal);
                             }
                        }
          | expression  {if (handler.getVarByName($name.text).getType().equals("int")) {
                             handler.getVarByName($name.text).setValue($expression.intVal);
                             }
                             else {
                             handler.getVarByName($name.text).setValue($expression.strVal);
                             }
                         }
    )?
    )* WS* ';' WS* {parser.writeVariables(handler.scope);}
    ;

type
    :   ('node' | 'doc' | 'attr' | 'int' | 'string' )
    ;

name
    :   STRING
    ;

value returns[String strVal, int intVal]
    :   ('"'WS* STRING WS*'"'   {$strVal = $STRING.text;}
    |   INT                     {$intVal = Integer.parseInt($INT.text);}
    )
    ;


//-------------------

term returns[String strVal, int intVal, String typeOfValue]
	:	'"'WS* STRING WS*'"'    {$strVal = $STRING.text; $typeOfValue = "String";} {parser.addToAppender($STRING.text);}
	|   STRING                  {if (handler.getVarByName($STRING.text).getType().equals("int")) {
	                                $intVal = (Integer) handler.getVarByName($STRING.text).getValue();
	                                $typeOfValue = "Int";
	                                } else {
	                                $strVal = (String) handler.getVarByName($STRING.text).getValue();
                                    $typeOfValue = "String";
	                                }
	                            } {parser.write("term");}
	|	'(' expression ')'      { if (null != $expression.strVal) {
	                                $strVal = $expression.strVal;
	                                $typeOfValue = "String";
	                                } else {
	                                $intVal = $expression.intVal;
	                                $typeOfValue = "Int";
	                              }
	                            }
	|	INT                     {$intVal = Integer.parseInt($INT.text); $typeOfValue = "Int";} {parser.addToAppender($INT.text);}
	;


mult returns[String strVal, int intVal, String typeOfValue]
	:	WS* t1=term WS* { $typeOfValue = $t1.typeOfValue;
	                     if ($t1.typeOfValue.equals("String")){
	                         $strVal = $t1.strVal;
	                         } else if ($t1.typeOfValue.equals("Int")){
                                    $intVal = $t1.intVal;
                             }
                         } {parser.write("mult");}
	('*' WS* t2=term WS* { if ($t2.typeOfValue.equals("Int")){
                             $intVal = $t2.intVal * $t1.intVal;
                             System.out.println("mult - " + $intVal);
                             }
                         }
	| '/' WS* t3=term WS*{ if ($t3.typeOfValue.equals("Int")){
                             $intVal = $t1.intVal / $t3.intVal;
                             System.out.println("mult - " + $intVal);
                             }
                        }
	)*
	;

add returns[String strVal, int intVal, String typeOfValue]
	:	WS* m1=mult WS* { $typeOfValue = $m1.typeOfValue;
	                      if ($m1.typeOfValue.equals("String")){
                         	 $strVal = $m1.strVal;
                         	 } else if ($m1.typeOfValue.equals("Int")){
                             $intVal = $m1.intVal;
                             }
	                     } {parser.write("add");}
	(WS* '+' WS* m2=mult WS* { if ($m2.typeOfValue.equals("String")){
                               $strVal = $m1.strVal + $m2.strVal;
                               } else if ($m1.typeOfValue.equals("Int")){
                               $intVal = $m1.intVal + $m2.intVal;
                               }
	                         } {parser.addToAppender("+");}
	| WS* '-' WS* m3=mult WS* { if ($m3.typeOfValue.equals("String")){
                                $strVal = $m1.strVal.replaceAll($m3.strVal, "");
                                } else if ($m1.typeOfValue.equals("Int")){
                                $intVal = $m1.intVal - $m3.intVal;
                                }
                              System.out.println("add - " + $intVal);
                              }
	)*
	;

relation returns[String strValF, String strValS, int intVal, String typeOfValue]
	:	WS* t1=term WS*
	(('==' | '!=' | '<' | '<=' | '>=' | '>') WS*
	 t2=term WS* {$strValF = $t1.strVal; $strValS = $t2.strVal;}
	)*
	;

expression returns[String strVal, int intVal]
	: add { if ($add.typeOfValue.equals("String")){
                       $strVal = $add.strVal;
                   } else if ($add.typeOfValue.equals("Int")){
                       $intVal = $add.intVal;
                   }
                 } {parser.write("expr");}
    | (STRING ' = ' add)
	;

math
    :   SYMB ' = ' SYMB WS* MATH_SYMB WS* SYMB ';'
    ;

//-------------------------------

statement
    :   ifstatement
    |   whilestatement
    |   forstatement
    ;

ifstatement
    :   'if' WS* '(' WS* relation {parser.makeRelationHeader($relation.strValF, $relation.strValS, "if");} {parser.appenderFlag = true;}
     WS* ')' WS*
        (expression WS* ';' {parser.makeRelationBody($expression.val);})* WS*
        ('else' WS* expression)* WS*
        'endif'
    ;

whilestatement
    :   'while' WS* '(' WS* expression WS* ')' WS*
        ('do' WS* expression)* WS*
        'endwhile'
    ;

forstatement
    :   'for' WS* '(' WS* expression WS* ';' WS* expression WS* ';' WS* expression WS* ')' WS*
        (WS* expression)* WS*
        'endfor'
    ;

//-------------
    procedure
    	:	'procedure' WS+ name WS+ '(' WS* parameters?  WS*')' WS*
    		(variable | statement | procedure | function)* WS*
    		'end' WS*
    	;


    function
    	:	'function' WS+ type WS+ name WS+ '(' WS+ parameters? WS+ ')' WS*
    		(variable | statement | procedure | function)* WS*
    		'return' WS+ expression WS+ ';' WS*
    		'end' WS*
    	;

    parameters
    	:	parameter ( WS* ',' WS* parameter WS*)
    	;

    parameter
    	:	type WS+ name
    	;




    MATH_SYMB :('+' | '-' | '/' | '*' | '=');
    STRING : ([a-z] | [A-Z])+;
    INT : [0-9]+;
    WORD : 'a'..'z'+;
    WS : (' ' | '\t' | '\n' | '\r' | '\t')*;
    SYMB : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;