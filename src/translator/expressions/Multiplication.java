package translator.expressions;

import translator.Expression;

public class Multiplication extends BinaryOperation {
	public Multiplication(Expression left, Expression right) {	super(left, right);	}
	protected String operator() {								return "*";			}
}
