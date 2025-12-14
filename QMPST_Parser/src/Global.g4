grammar Global;

prog: global EOF;

global
    : participant '->' participant ':' '{' labelType (',' labelType)+ '}'       #Transmission
    | participant '->' participant ':' labelType                                #TransmissionNoSet
    | 'μ' TYPEVAR '.' global                                                    #Recursion
    | TYPEVAR                                                                   #Variable
    | END                                                                       #End
    ;

labelType
    : label '(' BASETYPE ')' '.' global                                         #Label1
    | '(' BASETYPE ')' '.' global                                               #Label2
    | label '.' global                                                          #Label3
    ;


label: ID;
participant: ID;



//Tokens
BASETYPE
    : 'bit'
    | 'qbit'
    | 'unit'
    | 'int'
    ;

TYPEVAR: [a-z];
END: 'end';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
WS: [ \t\r\n]+ -> skip;