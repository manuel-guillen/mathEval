package translator.expressions;

import translator.Expression;

public class Negation extends UnaryOperation {
	public Negation(Expression expr) {
		super(expr);
	}
	
	@Override
	public Expression derivative(String variable) {
		return expr.derivative(variable).negate();
	}

	@Override
	public String operation() {
		return "-";
	}

	@Override
	public int precedence() {
		return 3;
	}
}
