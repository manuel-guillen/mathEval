package translator.expressions;

import translator.Expression;

public class Addition extends BinaryOperation {
	public Addition(Expression left, Expression right) {		super(left, right);	}
	protected String operator() {								return "+";			}
}
