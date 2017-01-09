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

}
