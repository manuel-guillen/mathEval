package translator.expressions;

import translator.Expression;

public class Division extends BinaryOperation {
	
	public Division(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public String operation() {
		return "/";
	}

	@Override
	public int precedence() {
		return 4;
	}
	
	@Override
	public Expression simplify() {
		// TODO Implement simplification
		return this;
	}

	@Override
	public Expression derivative(String variable) {
		return left.derivative(variable).multiply(right).subtract(left.multiply(right.derivative(variable))).divide(right.sqr());
	}
	
}
