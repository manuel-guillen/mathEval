package translator.expressions;

import java.util.Objects;

import translator.Expression;

public abstract class BinaryOperation implements Expression {

	protected Expression left, right;
	
	public BinaryOperation(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	protected abstract String operator();
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof BinaryOperation)) return false;
		BinaryOperation other = (BinaryOperation) obj;
		return this.operator().equals(other.operator()) && this.left.equals(other.left) && this.right.equals(other.right);
	}
	
	@Override
	public String toString() {
		return "(" + left + ") " + operator() + " (" + right + ")";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(left, right);
	}
	
}
