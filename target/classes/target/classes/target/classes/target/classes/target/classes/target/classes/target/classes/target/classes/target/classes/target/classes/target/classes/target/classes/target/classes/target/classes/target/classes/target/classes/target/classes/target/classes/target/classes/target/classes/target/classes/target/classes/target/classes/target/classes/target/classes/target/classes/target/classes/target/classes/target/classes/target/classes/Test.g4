grammar Test;

options {
    language = Java;
}

program
    :   'program' WS

        'start' WS

            (variable WS)*


        'finish' WS STRING
    ;

variable
    :  type WS STRING ' = ' value* (' , ' STRING WS value*)* ';'
    ;

type
    :   ('node' | 'doc' | 'attr')
    ;

value
    :   (STRING | INT)
    ;



    STRING : ([a-z] | [A-Z])+;
    INT : [0-9]+;
    WORD : 'a'..'z'+;
    WS : (' ' | '\t' | '\n' | '\r' | '\t');