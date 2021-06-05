grammar calculator;
/*-------------------
LEXER RULES
-------------------*/
NUMBER: INT | FLOAT;
INT: [0-9]+;
FLOAT: ([0-9]*DOT)[0-9]+;
WHITESPACE: [ \t\r] -> skip;
NEWLINE: [\n] -> skip;

// Keywords
LPAREN: '(';
RPAREN: ')';
DOT: '.';
SQUAREROOT: 'sqrt';
SQUARE: 'square';
LOG: 'log';

// Operators
ADD: '+';
SUBTRACT: '-';
MULTIPLY: '*';
DIVIDE: '/';
MOD: '%';
SIN: 'sin';
COS: 'cos';
TAN: 'tan';
COT: 'cot';

/*-------------------
PARSER RULES
-------------------*/
start: expression EOF; // start of expression

expression: 
LPAREN expression RPAREN #parentheses // rule for parsring parentheses
| expression multdivmodoperator = (MULTIPLY| DIVIDE | MOD) expression #mulDivideMod // rule for parsing multiply/divide/mod
| expression addsuboperator = (ADD | SUBTRACT) expression  #addSubtract // rule for parsing add/subtract
| SQUAREROOT expression #squareRoot // rule for parsing squareroot
| SQUARE expression #square // rule for parsing square
| LOG expression #log // rule for parsing log
| trigOperators = (SIN | COS | TAN | COT) expression #trigFunctions // rule for parsing sin/cos/tan/cot
| NUMBER #number; // rule for parsing actual number

/*example input
2*(3+4)
*/




