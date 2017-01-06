package translator.expressions;

import java.util.Objects;

import translator.Expression;

public class Exponentiation implements Expression {

	private Expression left, right;

	public Exponentiation(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "(" + left + ") ^ (" + right + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Exponentiation)) return false;
		Exponentiation other = (Exponentiation) obj;
		return this.left.equals(other.left) && this.right.equals(other.right);
	}

	@Override
	public int hashCode() {
		return Objects.hash(left, right);
	}
	
}
