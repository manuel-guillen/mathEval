package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class HyperbolicCotangent extends Function {

	public HyperbolicCotangent(Expression expr) {
		super(expr);
	}

	@Override
	public String operation() {
		return "coth";
	}

}
