package translator.expressions;

import java.util.Objects;

import translator.Expression;

public class Addition implements Expression {

	private Expression left, right;

	public Addition(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "(" + left + ") + (" + right + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Addition)) return false;
		Addition other = (Addition) obj;
		return this.left.equals(other.left) && this.right.equals(other.right);
	}

	@Override
	public int hashCode() {
		return Objects.hash(left, right);
	}

}
