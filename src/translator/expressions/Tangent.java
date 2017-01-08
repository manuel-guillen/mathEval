package translator.expressions;

import translator.Expression;

public class Tangent extends Function {

	public Tangent(Expression expr) {
		super(expr);
	}

	@Override
	public String operation() {
		return "tan";
	}

}
