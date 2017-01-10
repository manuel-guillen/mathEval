package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class HyperbolicCosine extends Function {

	public HyperbolicCosine(Expression expr) {
		super(expr);
	}
	
	@Override
	public String operation() {
		return "cosh";
	}
	
	@Override
	public Expression simplify() {
		// TODO Implement simplification
		return this;
	}
	
	@Override
	protected Expression derivative() {
		return new HyperbolicSine(expr);
	}

}
