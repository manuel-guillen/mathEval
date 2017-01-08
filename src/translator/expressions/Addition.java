package translator.expressions;

import translator.Expression;

public class Addition extends BinaryOperation {
	public Addition(Expression left, Expression right) {
		super(left, right);
	}

	public String operation() {
		return "+";
	}

	public int precedence() {
		return 5;
	}
}
