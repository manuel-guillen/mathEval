package translator.expressions;

import translator.Expression;

public class Sine extends UnaryOperation {

	public Sine(Expression expr) {
		super(expr);
	}

	@Override
	public String operation() {
		return "sin";
	}

}
