package translator.expressions;

import translator.Expression;

public class Subtraction extends BinaryOperation {
	
	public Subtraction(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public String operation() {
		return "-";
	}
	
	@Override
	public int precedence() {
		return 5;
	}
	
	@Override
	public Expression simplify() {
		// TODO Implement simplification
		return this;
	}
	
	@Override
	public Expression derivative(String variable) {
		return left.derivative(variable).subtract(right.derivative(variable));
	}
	
}
