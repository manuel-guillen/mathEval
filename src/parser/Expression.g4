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

expr:					'(' expr ')'						#parenthesisExpr
	|	<assoc=right>	left=expr op='^' right=expr			#operationExpr
	|					left=expr op=('*' | '/') right=expr	#operationExpr
	|					left=expr op=('+' | '-') right=expr	#operationExpr
	| 					VARIABLE 							#variableExpr
	| 					NUMBER								#numberExpr
	;

NUMBER:		[0-9]+;
VARIABLE:	[A-Za-z]+;

WHITESPACE:	[ \t]+ -> skip;