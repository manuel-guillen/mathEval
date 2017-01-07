package translator.expressions;

import java.util.Objects;

import translator.Expression;

public class Negation implements Expression {

	private Expression expr;
	
	public Negation(Expression expr) {
		this.expr = expr;
	}

	@Override
	public String toString() {
		return "-(" + expr + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Negation)) return false;
		Negation other = (Negation) obj;
		return this.expr.equals(other.expr);
	}

	@Override
	public int hashCode() {
		return Objects.hash(expr);
	}
	
}
