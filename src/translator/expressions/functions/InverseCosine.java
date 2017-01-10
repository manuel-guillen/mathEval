package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class InverseCosine extends Function {

	public InverseCosine(Expression expr) {
		super(expr);
	}
	
	@Override
	public String operation() {
		return "acos";
	}
	
	@Override
	public Expression simplify() {
		// TODO Implement simplification
		return this;
	}
	
	@Override
	protected Expression derivative() {
		return ONE.divide(new SquareRoot(ONE.subtract(expr.sqr()))).negate();
	}

}
