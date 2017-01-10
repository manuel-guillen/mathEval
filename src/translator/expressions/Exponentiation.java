package translator.expressions;

import translator.Expression;

public class Exponentiation extends BinaryOperation {
	
	public Exponentiation(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public String operation() {
		return "^";
	}
	
	@Override
	public int precedence() {
		return 2;
	}
	
	@Override
	public Expression simplify() {
		Expression left = this.left.simplify();
		Expression right = this.right.simplify();
		
		if (left.equals(ZERO) || right.equals(ZERO)) {
			if (left.equals(ZERO) && right.equals(ZERO)) throw new ArithmeticException("Indeterminate form 0^0");
			if (left.equals(ZERO)) return ZERO;
			else				   return ONE;
		}
		
		if (left.isNumber() && right.isNumber())
			return new Number(left.getValue() * right.getValue());
		
		if (left.equals(ONE)) return ONE;
		if (right.equals(ONE)) return left;
		
		return left.pow(right);
	}
	
	@Override
	public Expression derivative(String variable) {
		return this.multiply(right.derivative(variable).multiply(Expression.ln(left)).add(left.derivative(variable).multiply(right.divide(left))));
	}
	
}
