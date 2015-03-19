grammar Test;

options {
    language = Java;
}

program
    :   'program' WS*

        'start' WS*

            (variable)*


        'finish'
    ;

variable
    : (CONST WS)? type WS name ' = '? value? (', ' name ' = '? value?)* ';' WS
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


    STRING : ([a-z] | [A-Z])+;
    INT : [0-9]+;
    WORD : 'a'..'z'+;
    CONST : [a-z]+;
    WS : (' ' | '\t' | '\n' | '\r' | '\t');