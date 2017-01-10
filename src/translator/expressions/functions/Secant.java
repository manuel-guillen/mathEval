package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class Secant extends Function {

	public Secant(Expression expr) {
		super(expr);
	}
	
	@Override
	public String operation() {
		return "sec";
	}
	
	@Override
	public Expression simplify() {
		// TODO Implement simplification
		return this;
	}
	
	@Override
	protected Expression derivative() {
		return this.multiply(new Tangent(expr));
	}

}
