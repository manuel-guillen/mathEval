package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class ExponentialFunction extends Function {

	public ExponentialFunction(Expression expr) {
		super(expr);
	}
	
	@Override
	public String operation() {
		return "exp";
	}
	
	@Override
	public Expression simplify() {
		// TODO Implement simplification
		return this;
	}
	
	@Override
	protected Expression derivative() {
		return this;
	}

}
