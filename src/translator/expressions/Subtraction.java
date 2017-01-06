package translator.expressions;

import java.util.Objects;

import translator.Expression;

public class Subtraction implements Expression {

	private Expression left, right;

	public Subtraction(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "(" + left + ") - (" + right + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Subtraction)) return false;
		Subtraction other = (Subtraction) obj;
		return this.left.equals(other.left) && this.right.equals(other.right);
	}

	@Override
	public int hashCode() {
		return Objects.hash(left, right);
	}

}
