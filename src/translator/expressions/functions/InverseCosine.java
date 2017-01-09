package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class InverseCosine extends Function {

	public InverseCosine(Expression expr) {
		super(expr);
	}
	
	@Override
	protected Expression derivative() {
		return ONE.divide(new SquareRoot(ONE.subtract(expr.sqr()))).negate();
	}

	@Override
	public String operation() {
		return "acos";
	}

}
