package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class HyperbolicCotangent extends Function {

	public HyperbolicCotangent(Expression expr) {
		super(expr);
	}
	
	@Override
	protected Expression derivative() {
		return new HyperbolicCosecant(expr).sqr().negate();
	}

	@Override
	public String operation() {
		return "coth";
	}

}
