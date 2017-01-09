package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class Cosecant extends Function {

	public Cosecant(Expression expr) {
		super(expr);
	}

	@Override
	public String operation() {
		return "csc";
	}

}
