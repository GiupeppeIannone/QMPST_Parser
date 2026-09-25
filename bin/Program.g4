grammar Program;

prog: multipartySystems ('|' multipartySystems)* EOF;

multipartySystems: participant '-' '>' process;

process
    : 'new' VAR '.' process                                                                     #QbGeneration
    | VAR ':' '=' 'meas' '(' VAR (',' VAR)* ')' '.' process                                     #Measurement
    | participant '&' branch                                                                    #Branching
    | participant '⊕' label? '<' expression ( ',' expression)* '>' '.' process                  #Selection
    | 'if' expression 'then' process 'else' process                                             #Conditional
    | 'def' PROCNAME '(' VAR (',' VAR)* ')' '=' process 'in' process                            #Definition
    | PROCNAME '<' expression (',' expression)* '>'                                             #Call
    | unitop                                                                                    #UnitaryOp
    | '0' ('_' '{' VAR '}')?                                                                    #Inaction
    ;

branch
    : '{' branchType (',' branchType)+ '}'
    | branchType
    ;

branchType
    : label '(' VAR (',' VAR)* ')' '.' process                                                  #BranchLabel1
    | '(' VAR (',' VAR)* ')' '.' process                                                        #BranchLabel2
    | label '.' process                                                                         #BranchLabel3
    ;

expression
    : VAR
    | CONSTANT
    | expression OP expression
    ;

unitop
    : 'H''(' VAR ')' '.' process                                                                #Hadamar
    | 'CNot''(' VAR ',' VAR ')' '.' process                                                     #ControlledNot
    | 'σ''_''{'PAULI'}''(' VAR ')' '.' process                                                  #PauliTransformation
    /* | 'hd''(' VAR ')' '.' process
    | 'tl''(' VAR ')' '.' process
    | 'fst''(' VAR ')' '.' process
    | 'snd''(' VAR ')' '.' process */
    ;
label: ID;
participant: ID;

//Tokens
VAR: ('-q-')? [a-z];
PAULI: [a-z0-3];
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
ID: [a-zA-Z_][a-zA-Z0-9_]*;
WS: [ \t\r\n]+ -> skip;