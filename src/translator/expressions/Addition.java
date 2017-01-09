package translator.expressions;

import translator.Expression;

public class Addition extends BinaryOperation {
	public Addition(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public Expression derivative(String variable) {
		return left.derivative(variable).add(right.derivative(variable));
	}

	public String operation() {
		return "+";
	}

	public int precedence() {
		return 5;
	}
}
