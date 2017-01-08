package translator.expressions;

import java.util.Objects;

import translator.Expression;

public abstract class BinaryOperation implements Operation {

	protected Expression left, right;

	public BinaryOperation(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof BinaryOperation)) return false;
		BinaryOperation other = (BinaryOperation) obj;
		return this.operation().equals(other.operation()) && this.left.equals(other.left) && this.right.equals(other.right);
	}

	@Override
	public String toString() {
		return ((left instanceof Operation && ((Operation) left).precedence() > this.precedence()) ? "(" + left + ")" : left) + operation() + 
				((right instanceof Operation && ((Operation) right).precedence() > this.precedence()) ? "(" + right + ")" : right);
	}

	@Override
	public int hashCode() {
		return Objects.hash(left, right);
	}

}
