package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class InverseCosine extends Function {

	public InverseCosine(Expression expr) {
		super(expr);
	}

	@Override
	public String operation() {
		return "acos";
	}

}
