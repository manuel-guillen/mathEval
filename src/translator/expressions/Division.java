package translator.expressions;

import translator.Expression;

public class Division extends BinaryOperation {
	public Division(Expression left, Expression right) {
		super(left, right);
	}

	public String operation() {
		return "/";
	}

	public int precedence() {
		return 2;
	}
}
