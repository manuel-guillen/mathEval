package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class HyperbolicCosine extends Function {

	public HyperbolicCosine(Expression expr) {
		super(expr);
	}
	
	@Override
	protected Expression derivative() {
		return new HyperbolicSine(expr);
	}

	@Override
	public String operation() {
		return "cosh";
	}

}
