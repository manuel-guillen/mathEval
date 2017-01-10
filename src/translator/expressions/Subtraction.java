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
		Expression left = this.left.simplify();
		Expression right = this.right.simplify();
		
		if (left.isNumber() && right.isNumber())
			return new Number(left.getValue() - right.getValue());
		
		if (left.equals(ZERO)) return right.negate();
		if (right.equals(ZERO)) return left;
		if (left.equals(right)) return ZERO;
		
		return left.subtract(right);
	}
	
	@Override
	public Expression derivative(String variable) {
		return left.derivative(variable).subtract(right.derivative(variable));
	}
	
}
