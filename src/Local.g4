grammar Local;

local
    : participant '&' labelSet          #Receive
    | participant '⊕' labelSet          #Send
    | 'μ' TYPEVAR '.' local             #Recursion
    | TYPEVAR                           #Variable
    | END                               #End
    ;

labelSet
    : '{' labelType (',' labelType)+ '}'    #Multiple
    | labelType                             #SingleChoice
    ;

labelType
    : label '(' BASETYPE ')' '.' local      #Label1
    | '(' BASETYPE ')' '.' local            #Label2
    | label '.' local                       #Label3
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

TYPEVAR: '_'[a-z];
END: 'end';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
WS: [ \t\r\n]+ -> skip;