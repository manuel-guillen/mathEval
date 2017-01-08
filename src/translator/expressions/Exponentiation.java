package translator.expressions;

import translator.Expression;

public class Exponentiation extends BinaryOperation {
	public Exponentiation(Expression left, Expression right) {
		super(left, right);
	}

	public String operation() {
		return "^";
	}

	public int precedence() {
		return 1;
	}
}
