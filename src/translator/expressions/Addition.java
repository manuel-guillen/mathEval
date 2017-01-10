package translator.expressions;

import translator.Expression;

public class Addition extends BinaryOperation {
	
	public Addition(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public String operation() {
		return "+";
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
		return left.derivative(variable).add(right.derivative(variable));
	}
	
}
