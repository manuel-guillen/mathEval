package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class InverseTangent extends Function {

	public InverseTangent(Expression expr) {
		super(expr);
	}
	
	@Override
	public String operation() {
		return "atan";
	}
	
	@Override
	public Expression simplify() {
		// TODO Implement simplification
		return this;
	}
	
	@Override
	protected Expression derivative() {
		return ONE.divide(ONE.add(expr.sqr()));
	}

}
