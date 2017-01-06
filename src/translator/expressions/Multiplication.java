package translator.expressions;

import java.util.Objects;

import translator.Expression;

public class Multiplication implements Expression {

	private Expression left, right;

	public Multiplication(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "(" + left + ") * (" + right + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Multiplication)) return false;
		Multiplication other = (Multiplication) obj;
		return this.left.equals(other.left) && this.right.equals(other.right);
	}

	@Override
	public int hashCode() {
		return Objects.hash(left, right);
	}
	
}
