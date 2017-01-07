package translator.expressions;

import translator.Expression;

public class Subtraction extends BinaryOperation {
	public Subtraction(Expression left, Expression right) {		super(left, right);	}
	protected String operator() {								return "-";			}
}
