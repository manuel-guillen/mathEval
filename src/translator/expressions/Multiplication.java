package translator.expressions;

import translator.Expression;

public class Multiplication extends BinaryOperation {
	
	public Multiplication(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public String operation() {
		return "*";
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
		return left.derivative(variable).multiply(right).add(left.multiply(right.derivative(variable)));
	}
	
}
