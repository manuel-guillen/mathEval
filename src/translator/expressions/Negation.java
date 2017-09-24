package translator.expressions;

import translator.Expression;

public class Negation extends UnaryOperation {
	
	public Negation(Expression expr) {
		super(expr);
	}
	
	@Override
	public String operation() {
		return "-";
	}

	@Override
	public int precedence() {
		return 3;
	}
	
	@Override
	public Expression simplify() {
		Expression expr = this.expr.simplify();
		if (expr instanceof Negation) return ((Negation) expr).expr;
		
		return expr.negate();
	}
	
	@Override
	public Expression derivative(String variable) {
		return expr.derivative(variable).negate();
	}
	
}
