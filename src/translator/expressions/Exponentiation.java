package translator.expressions;

import translator.Expression;

public class Exponentiation extends BinaryOperation {
	public Exponentiation(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public Expression derivative(String variable) {
		return this.multiply(right.derivative(variable).multiply(Expression.ln(left)).add(left.derivative(variable).multiply(right.divide(left))));
	}
	
	public String operation() {
		return "^";
	}

	public int precedence() {
		return 2;
	}
}
