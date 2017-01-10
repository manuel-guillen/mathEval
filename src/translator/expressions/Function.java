package translator.expressions;

import translator.Expression;

public abstract class Function extends UnaryOperation {

	public Function(Expression expr) {
		super(expr);
	}

	@Override
	public int precedence() {
		return 1;
	}

	protected abstract Expression derivative();

	@Override
	public Expression derivative(String variable) {
		return derivative().multiply(expr.derivative(variable));
	}

	@Override
	public String toString() {
		return operation() + "(" + expr + ")";
	}

}
