package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class HyperbolicTangent extends Function {

	public HyperbolicTangent(Expression expr) {
		super(expr);
	}
	
	@Override
	public String operation() {
		return "tanh";
	}
	
	@Override
	public Expression simplify() {
		// TODO Implement simplification
		return this;
	}
	
	@Override
	protected Expression derivative() {
		return new HyperbolicSecant(expr).sqr();
	}

}
