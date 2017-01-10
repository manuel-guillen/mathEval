package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class Tangent extends Function {

	public Tangent(Expression expr) {
		super(expr);
	}
	
	@Override
	public String operation() {
		return "tan";
	}
	
	@Override
	public Expression simplify() {
		// TODO Implement simplification
		return this;
	}
	
	@Override
	protected Expression derivative() {
		return new Secant(expr).sqr();
	}

}
