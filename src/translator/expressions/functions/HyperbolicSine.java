package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class HyperbolicSine extends Function {

	public HyperbolicSine(Expression expr) {
		super(expr);
	}
	
	@Override
	protected Expression derivative() {
		return new HyperbolicCosine(expr);
	}

	@Override
	public String operation() {
		return "sinh";
	}

}
