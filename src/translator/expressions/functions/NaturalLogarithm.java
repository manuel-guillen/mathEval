package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class NaturalLogarithm extends Function {

	public NaturalLogarithm(Expression expr) {
		super(expr);
	}

	@Override
	public String operation() {
		return "ln";
	}
	
	@Override
	public Expression simplify() {
		// TODO Implement simplification
		return this;
	}
	
	@Override
	protected Expression derivative() {
		return ONE.divide(expr);
	}

}
