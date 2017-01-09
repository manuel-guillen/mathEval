package translator.expressions;

import translator.Expression;

public class Subtraction extends BinaryOperation {
	public Subtraction(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public Expression derivative(String variable) {
		return left.derivative(variable).subtract(right.derivative(variable));
	}

	public String operation() {
		return "-";
	}

	public int precedence() {
		return 5;
	}
}
