package translator.expressions;

import translator.Expression;

public class Cosine extends Function {

	public Cosine(Expression expr) {
		super(expr);
	}

	@Override
	public String operation() {
		return "cos";
	}

}
