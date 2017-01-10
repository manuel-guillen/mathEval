package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class Cotangent extends Function {

	public Cotangent(Expression expr) {
		super(expr);
	}
	
	@Override
	public String operation() {
		return "cot";
	}
	
	@Override
	public Expression simplify() {
		// TODO Implement simplification
		return this;
	}
	
	@Override
	protected Expression derivative() {
		return new Cosecant(expr).sqr().negate();
	}

}
