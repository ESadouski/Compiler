grammar Test;

options {
    language = Java;
}

program
    :   'program' WS*

        'start' WS*

            (variable | constant)*


        'finish'
    ;

variable
    : type WS name ' = '? value? (', ' name ' = '? value?)* ';' WS {System.out.print("ITS VARIABLE");}
    ;

constant
    : 'const ' type WS name ' = ' value (', ' name ' = ' value)* ';' WS
    ;

type
    :   ('node' | 'doc' | 'attr')
    ;

name
    :   STRING
    ;

value
    :   (STRING | INT)
    ;

expression
    :   value
    |   '(' WS operation WS ')'
    |
    ;

operation
    :   plus
    |   minus
    |   mult
    |   devide
    ;

plus
    :   '+'
    ;

minus
    :   '-'
    ;

mult
    :   '*'
    ;

devide
    :   '/'
    ;




    STRING : ([a-z] | [A-Z])+;
    INT : [0-9]+;
    WORD : 'a'..'z'+;
    WS : (' ' | '\t' | '\n' | '\r' | '\t')+;