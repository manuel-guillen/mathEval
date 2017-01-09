package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class Cosecant extends Function {

	public Cosecant(Expression expr) {
		super(expr);
	}
	
	@Override
	protected Expression derivative() {
		return this.multiply(new Cotangent(expr)).negate();
	}

	@Override
	public String operation() {
		return "csc";
	}

}
