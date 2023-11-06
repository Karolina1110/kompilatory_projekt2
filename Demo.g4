// Demo for two types expression grammar
// Bartosz Sawicki, 2014-05-12

grammar Demo;

prog: block
;

block: ( (stat|func)? NEWLINE )*
;

stat: FOR '(' rep ')' NEWLINE block2 END                   #for
    | IF '(' cond ')' NEWLINE blockif END                  #if
    | DO ID                                                #doFunc
    |tabelem EQUAL value                                   #assignTabElem
    | ID EQUAL expr0                                       #assign
    | PRINT ID                                             #print
    | PRINT tabelem                                        #printTabElem
    | READ valuet ID                                       #read
;

block2: ( stat? NEWLINE )*
;

blockif: block2
;

func: FUNCTION type ID NEWLINE blockfunc ret END
;

type: TINT
    | TREAL
;

ret: RETURN ID NEWLINE
;

param: ID
;

blockfunc: block2
;

expr0: expr1        #intreal
      | STRING      #string
      | tab         #tab0
      | DO ID       #return
;

expr1:  expr2               #single
      | expr1 MULT expr1      #mult
      | expr1 DIV expr1      #div
      | expr1 ADD expr1      #add
      | expr1 SUB expr1      #sub

;

expr2:  value       #val
       | ID            #id
       | tabelem        #element
       | TOINT expr2      #toint
       | TOREAL expr2     #toreal
       | '(' expr1 ')'    #par
;

cond: expr1 sign expr1
;

rep: cnt
;

cnt: INT
    | ID
;

sign: EQUALL     // #equalCond
      | NOTEQUAL    //  #notEqualCond
      | GREATER      //  #greaterCond
      | LESS          // #lessCond
      | GREATER_EQUAL // #greaterEqualCond
      | LESS_EQUAL    // #lessEqualCond
;

tabelem: ID '{' INT '}'
;


value:  INT
        | REAL
;

valuet: TINT
    |TREAL
;

tab: TINT TTAB '[' INT ']'
    | TREAL TTAB '[' INT ']'
;


PRINT: 'print'
    ;

READ: 'read'
    ;

WHILE: 'while'
;

FOR: 'for'
;

IF: 'if'
;

FUNCTION: 'function'
;

DO: 'do'
;

RETURN: 'return'
;

TOINT: '(int)'
    ;

TOREAL: '(real)'
    ;

TINT: 'int'
;

TREAL: 'real'
;

TSTRING: 'string'
;

TTAB: 'tab'
;

END:  'end'
;

ID:   ('a'..'z'|'A'..'Z')+'_'?([0-9]+)?'_'?
   ;

STRING:  '"'('a'..'z'|'A'..'Z')+'"'
    ;

MULT: '*'
    ;

DIV: '/'
    ;

ADD: '+'
    ;

SUB: '-'
    ;

REAL: ('-')?'0'..'9'+'.''0'..'9'+
    ;

INT: ('-')?'0'..'9'+
    ;


EQUALL: '=='
    ;


NOTEQUAL: '!='
    ;

EQUAL: '='
    ;


GREATER: '>'
;

LESS: '<'
;

GREATER_EQUAL: '>='
;

LESS_EQUAL: '<='
;

NEWLINE:   '\r'? '\n'
    ;


WS:   (' '|'\t')+ -> skip
    ;