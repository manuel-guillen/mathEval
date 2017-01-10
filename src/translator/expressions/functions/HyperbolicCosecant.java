package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class HyperbolicCosecant extends Function {

	public HyperbolicCosecant(Expression expr) {
		super(expr);
	}
	
	@Override
	public String operation() {
		return "csch";
	}
	
	@Override
	public Expression simplify() {
		// TODO Implement simplification
		return this;
	}
	
	@Override
	protected Expression derivative() {
		return this.multiply(new HyperbolicCotangent(expr)).negate();
	}

}
