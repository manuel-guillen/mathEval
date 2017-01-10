package translator.expressions;

import java.util.Objects;

import translator.Expression;

public class Variable implements Expression {

	private String name;

	public Variable(String name) {
		this.name = name;
	}
	
	@Override
	public boolean isNumber() {
		return false;
	}
	
	@Override
	public double getValue() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Expression simplify() {
		return this;
	}
	
	@Override
	public Expression derivative(String variable) {
		return name.equals(variable) ? ONE : ZERO;
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Variable)) return false;
		Variable other = (Variable) obj;
		return this.name.equals(other.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

}
