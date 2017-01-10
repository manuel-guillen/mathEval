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
		Expression left = this.left.simplify();
		Expression right = this.right.simplify();
		
		if (right.equals(ZERO)) throw new ArithmeticException("Cannot divide by zero");
		if (left.equals(ZERO)) return ZERO;
		
		if (left.isNumber() && right.isNumber())
			return new Number(left.getValue() / right.getValue());
		
		if (right.equals(ONE)) return left;
		if (left.equals(right)) return ONE;
		
		if (right instanceof Division)
			return left.multiply(((BinaryOperation)right).right.divide(((BinaryOperation)right).left)).simplify();
		
		return left.divide(right);
	}

	@Override
	public Expression derivative(String variable) {
		return left.derivative(variable).multiply(right).subtract(left.multiply(right.derivative(variable))).divide(right.sqr());
	}
	
}
