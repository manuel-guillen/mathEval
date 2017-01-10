package translator.expressions;

import translator.Expression;

public interface Operation extends Expression {
	
	public String operation();
	public int precedence();
	
	@Override
	public default boolean isNumber() {
		return false;
	}
	
	@Override
	public default double getValue() {
		throw new UnsupportedOperationException();
	}
	
}
