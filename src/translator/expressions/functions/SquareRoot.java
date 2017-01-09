package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class SquareRoot extends Function {

	public SquareRoot(Expression expr) {
		super(expr);
	}
	
	@Override
	protected Expression derivative() {
		return ONE.divide(TWO.multiply(this));
	}

	@Override
	public String operation() {
		return "sqrt";
	}

}
