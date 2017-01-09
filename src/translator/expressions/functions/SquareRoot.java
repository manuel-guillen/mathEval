package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class SquareRoot extends Function {

	public SquareRoot(Expression expr) {
		super(expr);
	}

	@Override
	public String operation() {
		return "sqrt";
	}

}
