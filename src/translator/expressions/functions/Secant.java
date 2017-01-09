package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class Secant extends Function {

	public Secant(Expression expr) {
		super(expr);
	}

	@Override
	public String operation() {
		return "sec";
	}

}
