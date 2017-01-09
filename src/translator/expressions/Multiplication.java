package translator.expressions;

import translator.Expression;

public class Multiplication extends BinaryOperation {
	public Multiplication(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public Expression derivative(String variable) {
		return left.derivative(variable).multiply(right).add(left.multiply(right.derivative(variable)));
	}

	public String operation() {
		return "*";
	}

	public int precedence() {
		return 4;
	}
}
