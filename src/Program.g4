grammar Program;
import Local;

prog: multipartySystems ('|' multipartySystems)* EOF;

multipartySystems: participant '-' '>' process;

process
    : 'new' VAR '.' process                                                                                                     #QbGeneration
    | VAR ':' '=' 'meas' '(' VAR (',' VAR)* ')' '.' process                                                                     #Measurement
    | participant '&' branch                                                                                                    #Branching
    | participant '⊕' label? '<' ((expression ( ',' expression)*) | 'unit') '>' '.' process                                                  #Selection
    | 'if' expression 'then' process 'else' process                                                                             #Conditional
    | 'def' PROCNAME '(' '<' firstList=varList? '>' ';' '<' qbitList=varList? '>' ')' '=' process ':' local 'in' process        #Definition
    | PROCNAME '<' ((expression (',' expression)*) | 'null') '>'                                                                             #Call
    | unitop                                                                                                                    #UnitaryOp
    | '0' ('_' '{' VAR (',' VAR)* '}')?                                                                                         #Inaction
    ;

varList: VAR (',' VAR)*;

branch
    : '{' branchType (',' branchType)+ '}'                                                      #Mult
    | branchType                                                                                #Single
    ;

branchType
    : label '(' VAR (',' VAR)* ')' '.' process                                                  #BranchLabel1
    | '(' VAR (',' VAR)* ')' '.' process                                                        #BranchLabel2
    | label '.' process                                                                         #BranchLabel3
    ;
label: ID;
participant: ID;

expression
    : expression '+' expression
    | expression '-' expression
    | expression '*' expression
    | expression '/' expression
    | expression '%' expression
    | expression '@' expression
    | expression 'op' expression
    | CONSTANT
    | VAR
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

//Tokens
CONSTANT: [1-9][0-9]*;
VAR: [a-z];
PAULI: [a-z0-3];
PROCNAME: [A-Z];

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