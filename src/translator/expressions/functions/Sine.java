package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class Sine extends Function {

	public Sine(Expression expr) {
		super(expr);
	}
	
	@Override
	protected Expression derivative() {
		return new Cosine(expr);
	}
	
	@Override
	public String operation() {
		return "sin";
	}

}
