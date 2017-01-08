package translator.expressions;

import translator.Expression;

public interface Operation extends Expression {
	public int precedence();

	public String operation();
}
