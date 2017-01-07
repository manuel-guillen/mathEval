package translator.expressions;

import translator.Expression;

public class Division extends BinaryOperation {
	public Division(Expression left, Expression right) {		super(left, right);	}
	protected String operator() {								return "/";			}
}
