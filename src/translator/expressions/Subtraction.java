package translator.expressions;

import translator.Expression;

public class Subtraction extends BinaryOperation {
	public Subtraction(Expression left, Expression right) {
		super(left, right);
	}

	public String operation() {
		return "-";
	}

	public int precedence() {
		return 3;
	}
}
