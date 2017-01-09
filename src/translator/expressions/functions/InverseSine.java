package translator.expressions.functions;

import translator.Expression;
import translator.expressions.Function;

public class InverseSine extends Function {

	public InverseSine(Expression expr) {
		super(expr);
	}
	
	@Override
	protected Expression derivative() {
		return ONE.divide(new SquareRoot(ONE.subtract(expr.sqr())));
	}

	@Override
	public String operation() {
		return "asin";
	}

}
