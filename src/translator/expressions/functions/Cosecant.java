package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class Cosecant extends Function {

	public Cosecant(Expression expr) {
		super(expr);
	}
	
	@Override
	public String operation() {
		return "csc";
	}
	
	@Override
	public Expression simplify() {
		// TODO Implement simplification
		return this;
	}
	
	@Override
	protected Expression derivative() {
		return this.multiply(new Cotangent(expr)).negate();
	}

}
