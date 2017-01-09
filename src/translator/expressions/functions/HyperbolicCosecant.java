package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class HyperbolicCosecant extends Function {

	public HyperbolicCosecant(Expression expr) {
		super(expr);
	}

	@Override
	public String operation() {
		return "csch";
	}

}
