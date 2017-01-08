package translator.expressions;

import translator.Expression;

public class Sine extends Function {

	public Sine(Expression expr) {
		super(expr);
	}

	@Override
	public String operation() {
		return "sin";
	}

}
