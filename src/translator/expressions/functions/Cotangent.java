package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class Cotangent extends Function {

	public Cotangent(Expression expr) {
		super(expr);
	}
	
	@Override
	protected Expression derivative() {
		return new Cosecant(expr).sqr().negate();
	}

	@Override
	public String operation() {
		return "cot";
	}

}
