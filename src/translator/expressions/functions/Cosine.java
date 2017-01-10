package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class Cosine extends Function {

	public Cosine(Expression expr) {
		super(expr);
	}
	
	@Override
	public String operation() {
		return "cos";
	}
	
	@Override
	public Expression simplify() {
		// TODO Implement simplification
		return this;
	}
	
	@Override
	protected Expression derivative() {
		return new Sine(expr).negate();
	}

}
