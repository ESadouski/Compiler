grammar Test;

options {
    language = Java;
}

program
    :   'program' WS ID WS '=' WS
        'start' WS
        'finish' WS ID
    ;

    ID: [a-z]+;
    WS: (' ' | '\t' | '\n' | '\r' | '\t');