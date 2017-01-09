package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class SignFunction extends Function {

	public SignFunction(Expression expr) {
		super(expr);
	}
	
	@Override
	protected Expression derivative() {
		return ZERO;
	}
	
	@Override
	public String operation() {
		return "sgn";
	}

}
