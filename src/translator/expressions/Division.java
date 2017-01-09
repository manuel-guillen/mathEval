package translator.expressions;

import translator.Expression;

public class Division extends BinaryOperation {
	public Division(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public Expression derivative(String variable) {
		return left.derivative(variable).multiply(right).subtract(left.multiply(right.derivative(variable))).divide(right.sqr());
	}
	
	public String operation() {
		return "/";
	}

	public int precedence() {
		return 4;
	}
}
