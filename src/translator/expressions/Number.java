package translator.expressions;

import java.text.DecimalFormat;
import java.util.Objects;

import translator.Expression;

public class Number implements Expression {
	
	private double value;
	
	public Number(double value) {
		this.value = value;
	}
	
	@Override
	public boolean isNumber() {
		return true;
	}
	
	@Override
	public double getValue() {
		return value;
	}
	
	@Override
	public Expression simplify() {
		return this;
	}
	
	@Override
	public Expression derivative(String variable) {
		return ZERO;
	}
	
	private static final DecimalFormat NUMBER_FORMAT = new DecimalFormat("0.###############");
	
	@Override
	public String toString() {
		return NUMBER_FORMAT.format(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Number)) return false;
		Number other = (Number) obj;
		return this.value == other.value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

}
