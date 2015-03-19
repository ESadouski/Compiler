grammar Test;

options {
    language = Java;
}

program
    :   'program' WS WORD WS

        'start' WS

            variable WS ':' WORD


        'finish' WS WORD
    ;

variable
    :  type WS WORD value* WS (' , ' WORD WS value*)* ';'
    ;

type
    :   ('node' | 'doc' | 'attr')
    ;

value
    :   (' = ' (STRING | INT)+ )
    ;



    STRING : ([a-z] | [A-Z])+;
    INT : [0-9]+;
    WORD : 'a'..'z'+;
    WS : (' ' | '\t' | '\n' | '\r' | '\t');