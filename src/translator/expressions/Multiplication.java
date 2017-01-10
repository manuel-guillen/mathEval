package translator.expressions;

import translator.Expression;

public class Multiplication extends BinaryOperation {
	
	public Multiplication(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public String operation() {
		return "*";
	}
	
	@Override
	public int precedence() {
		return 4;
	}
	
	@Override
	public Expression simplify() {
		Expression left = this.left.simplify();
		Expression right = this.right.simplify();
		
		if (left.isNumber() && right.isNumber())
			return new Number(left.getValue() * right.getValue());
		
		if (left.equals(ZERO) || right.equals(ZERO)) return ZERO;
		if (left.equals(ONE)) return right;
		if (right.equals(ONE)) return left;
		if (ONE.divide(left).equals(right) || left.equals(ONE.divide(right))) return ONE;
		
		if (left instanceof Division && right instanceof Division) {
			BinaryOperation l = (BinaryOperation) left, r = (BinaryOperation) right;
			return l.left.multiply(r.left).divide(l.right.multiply(r.right)).simplify();
		}
		
		return left.multiply(right);
	}
	
	@Override
	public Expression derivative(String variable) {
		return left.derivative(variable).multiply(right).add(left.multiply(right.derivative(variable)));
	}
	
}
