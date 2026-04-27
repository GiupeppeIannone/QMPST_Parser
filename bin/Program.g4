grammar Program;

prog: (multipartySystems '|')* multipartySystems EOF;

multipartySystems: participant '▷' process;

process
    : 'new' VAR '.' process                                                                     #QbGeneration
    | VAR ':=' 'meas' quantum '.' process                                                       #Measurement
    | participant '&' '{' (label '('VAR')' '.' process ',')* label '('VAR')' '.' process '}'    #Branching
    | participant '⊕' label '<' expression '>' '.' process                                     #Selection
    | 'if' expression 'then' process 'else' process                                             #Conditional
    | 'def' PROCNAME '(' VAR ')' '=' process 'in' process                                       #Definition
    | PROCNAME '<' expression '>'                                                               #Call
    | UNITOP '(' quantum ')' '.' process                                                        #UnitaryOp
    | '0' '_' '{' quantum '}'                                                                   #Inaction
    ;

expression
    : VAR
    | QREF
    | CONSTANT
    | expression OP expression
    ;
quantum
    : VAR
    | QREF
    ;

label: ID;
participant: ID;

//Tokens
UNITOP
    : 'H'
    | 'CNot'
    | 'σ' [1-4]
    | 'hd'
    | 'tl'
    | 'fst'
    | 'snd'
    ;
PROCNAME: [A-Z];
OP
    : '+'
    | '-'
    | '*'
    | '/'
    | '%'
    | '@' 
    | 'op'
    ;
CONSTANT: [0-9]+;
QREF: '-q-'[a-z];
VAR: [a-z];
ID: [a-zA-Z_][a-zA-Z0-9_]*;
WS: [ \t\r\n]+ -> skip;