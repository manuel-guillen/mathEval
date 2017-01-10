package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class AbsoluteValue extends Function {

	public AbsoluteValue(Expression expr) {
		super(expr);
	}
	
	@Override
	public String operation() {
		return "abs";
	}
	
	@Override
	public Expression simplify() {
		// TODO Implement simplification
		return this;
	}
	
	@Override
	protected Expression derivative() {
		return new SignFunction(expr);
	}

}
