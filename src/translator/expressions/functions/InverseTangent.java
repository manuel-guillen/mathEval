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

}
