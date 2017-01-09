package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class AbsoluteValue extends Function {

	public AbsoluteValue(Expression expr) {
		super(expr);
	}
	
	@Override
	protected Expression derivative() {
		return new SignFunction(expr);
	}

	@Override
	public String operation() {
		return "abs";
	}

}
