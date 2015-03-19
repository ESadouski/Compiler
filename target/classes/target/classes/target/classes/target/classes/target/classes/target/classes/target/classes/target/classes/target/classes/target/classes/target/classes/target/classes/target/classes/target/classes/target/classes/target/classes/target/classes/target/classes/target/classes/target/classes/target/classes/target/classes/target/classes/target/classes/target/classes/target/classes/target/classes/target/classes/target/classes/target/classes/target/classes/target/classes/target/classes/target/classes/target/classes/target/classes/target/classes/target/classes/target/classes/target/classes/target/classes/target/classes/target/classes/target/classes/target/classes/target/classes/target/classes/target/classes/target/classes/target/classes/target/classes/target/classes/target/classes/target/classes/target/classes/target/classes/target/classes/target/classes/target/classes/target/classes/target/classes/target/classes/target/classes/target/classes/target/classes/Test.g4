grammar Test;

options {
    language = Java;
}

program
    :   'program' ID '='
        'start'
        'finish' ID
    ;

    ID: [a-z]+;
    WS: [\t\n]+ -> skip;