package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class HyperbolicSecant extends Function {

	public HyperbolicSecant(Expression expr) {
		super(expr);
	}

	@Override
	public String operation() {
		return "sech";
	}

}
