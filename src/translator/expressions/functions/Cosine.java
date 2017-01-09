package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class Cosine extends Function {

	public Cosine(Expression expr) {
		super(expr);
	}
	
	@Override
	protected Expression derivative() {
		return new Sine(expr).negate();
	}

	@Override
	public String operation() {
		return "cos";
	}

}
