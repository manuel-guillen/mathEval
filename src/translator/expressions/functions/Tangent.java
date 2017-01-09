package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class Tangent extends Function {

	public Tangent(Expression expr) {
		super(expr);
	}
	
	@Override
	protected Expression derivative() {
		return new Secant(expr).sqr();
	}

	@Override
	public String operation() {
		return "tan";
	}

}
