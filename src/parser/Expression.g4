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

expr:					func=('sin' | 'cos' | 'tan') '(' expr ')'	#functionExpr
	|					'(' expr ')'								#parenthesisExpr
	|					'-' expr									#negateExpr
	|	<assoc=right>	left=expr op='^' right=expr					#operationExpr
	|					left=expr op=('*' | '/') right=expr			#operationExpr
	|					left=expr op=('+' | '-') right=expr			#operationExpr
	| 					VARIABLE 									#variableExpr
	| 					NUMBER										#numberExpr
	;

NUMBER:		DIGIT+ ('.' DIGIT+)?;
VARIABLE:	[A-Za-z]+;

WHITESPACE:	[ \t]+ -> skip;

fragment
DIGIT:		[0-9]+;