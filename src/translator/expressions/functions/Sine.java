package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class Sine extends Function {

	public Sine(Expression expr) {
		super(expr);
	}
	
	@Override
	public String operation() {
		return "sin";
	}

	@Override
	public Expression simplify() {
		// TODO Implement simplification
		return this;
	}
	
	@Override
	protected Expression derivative() {
		return new Cosine(expr);
	}

}
