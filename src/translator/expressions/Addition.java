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
		Expression left = this.left.simplify();
		Expression right = this.right.simplify();
		
		if (left.isNumber() && right.isNumber())
			return new Number(left.getValue() + right.getValue());
		
		if (left.equals(ZERO)) return right;
		if (right.equals(ZERO)) return left;
		if (left.negate().equals(right) || left.equals(right.negate())) return ZERO;
		
		return left.add(right);
	}
	
	@Override
	public Expression derivative(String variable) {
		return left.derivative(variable).add(right.derivative(variable));
	}
	
}
