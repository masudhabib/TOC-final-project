grammar conditionalstatements;


/*-------------------
LEXER RULES
-------------------*/
PRINT:'print';
IS: 'is';
IF: 'if';
ELSE: 'else';
EQUALS:'==';
ID: [a-zA-Z]+;
NUMBER: [0-9]+;
WHITESPACE: [ \t\r\n] -> skip;


/*-------------------
PARSER RULES
-------------------*/

start: block;
block: statement+;
statement: conditinalstatement | assignment | print;
assignment: ID IS NUMBER;
conditinalstatement: IF expression ELSE block;
print: PRINT ID;
expression: ID EQUALS ID block; 

/*
example input
a is 4
b is 5 
if a == b 
print equal 
else 
print unequal
*/
