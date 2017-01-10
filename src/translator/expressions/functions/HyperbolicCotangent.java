package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class HyperbolicCotangent extends Function {

	public HyperbolicCotangent(Expression expr) {
		super(expr);
	}
	
	@Override
	public String operation() {
		return "coth";
	}
	
	@Override
	public Expression simplify() {
		// TODO Implement simplification
		return this;
	}
	
	@Override
	protected Expression derivative() {
		return new HyperbolicCosecant(expr).sqr().negate();
	}

}
