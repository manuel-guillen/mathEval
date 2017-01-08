package translator.expressions;

import translator.Expression;

public class Multiplication extends BinaryOperation {
	public Multiplication(Expression left, Expression right) {
		super(left, right);
	}

	public String operation() {
		return "*";
	}

	public int precedence() {
		return 4;
	}
}
