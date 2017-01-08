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
	
	@Override
	public String toString() {
		return operation() + "(" + expr + ")";
	}
	
}
