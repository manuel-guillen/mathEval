grammar Expression;

// ======================== CONFIGURATION ========================

@header {
	package parser;
}

@members {
    public void reportErrorsAsExceptions() {
        addErrorListener(new BaseErrorListener() {
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new ParseCancellationException(msg, e);
            }
        });
    }
}

// =========================== GRAMMAR ============================

funcName: 'abs'  | 'sgn'  | 'sqrt' | 'exp'  | 'ln'
		| 'sin'  | 'cos'  | 'tan'  | 'csc'  | 'sec'  | 'cot'
		| 'sinh' | 'cosh' | 'tanh' | 'csch' | 'sech' | 'coth'
		| 'asin' | 'acos' | 'atan'
		;

expr:					func=funcName '(' expr ')'					#functionExpr		// Precedence = 1
	|					'(' expr ')'								#parenthesisExpr	// Precedence = 1
	|	<assoc=right>	left=expr op='^' right=expr					#operationExpr		// Precedence = 2
	|					'-' expr									#negateExpr			// Precedence = 3
	|					left=expr op=('*' | '/') right=expr			#operationExpr		// Precedence = 4
	|					left=expr op=('+' | '-') right=expr			#operationExpr		// Precedence = 5
	| 					VARIABLE 									#variableExpr
	| 					NUMBER										#numberExpr
	;

NUMBER:		DIGIT+ ('.' DIGIT+)?;
VARIABLE:	[A-Za-z]+;

WHITESPACE:	[ \t]+ -> skip;

fragment
DIGIT:		[0-9]+;