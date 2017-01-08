package translator.expressions;

import java.util.Objects;

import translator.Expression;

public abstract class UnaryOperation implements Operation {

	protected Expression expr;

	public UnaryOperation(Expression expr) {
		this.expr = expr;
	}
	
	@Override
	public String toString() {
		return operation() + ((expr instanceof Operation && ((Operation) expr).precedence() > this.precedence()) ? "(" + expr + ")" : expr);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof UnaryOperation)) return false;
		UnaryOperation other = (UnaryOperation) obj;
		return this.operation().equals(other.operation()) && this.expr.equals(other.expr);
	}

	@Override
	public int hashCode() {
		return Objects.hash(expr);
	}

}
