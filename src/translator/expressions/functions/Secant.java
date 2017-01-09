package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class Secant extends Function {

	public Secant(Expression expr) {
		super(expr);
	}
	
	@Override
	protected Expression derivative() {
		return this.multiply(new Tangent(expr));
	}

	@Override
	public String operation() {
		return "sec";
	}

}
