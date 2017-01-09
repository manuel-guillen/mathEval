package translator;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.ExpressionLexer;
import parser.ExpressionParser;
import translator.expressions.*;
import translator.expressions.Number;
import translator.expressions.functions.*;

/**
 * An immutable data type representing the structure of a mathematical expression consisting 
 * of addition, subtraction, multiplication, division, exponentiation, and negation of
 * numbers and variables.
 */
public interface Expression {
	
	/*
	 * Recursive Data Type Definition:
	 * ==============================
	 *      Expression =   Number(value : double)
	 *                   + Variable(name: String)
	 *                   + Addition(left, right: Expression)
	 *                   + Subtraction(left, right: Expression)
	 *                   + Multiplication(left, right: Expression)
	 *                   + Division(left, right: Expression)
	 *                   + Exponentiation(left, right: Expression)
	 *                   + Negation(expr: Expression)
	 *                   + AbsoluteValue(expr: Expression)
	 *                   + SignFunction(expr: Expression)
	 *                   + SquareRoot(expr: Expression)
	 *                   + ExponentialFunction(expr: Expression)
	 *                   + NaturalLogarithm(expr: Expression)
	 *                   + Sine(expr: Expression)
	 *                   + Cosine(expr: Expression)
	 *                   + Tangent(expr: Expression)
	 *                   + Cosecant(expr: Expression)
	 *                   + Secant(expr: Expression)
	 *                   + Cotangent(expr: Expression)
	 *                   + HyperbolicSine(expr: Expression)
	 *                   + HyperbolicCosine(expr: Expression)
	 *                   + HyperbolicTangent(expr: Expression)
	 *                   + HyperbolicCosecant(expr: Expression)
	 *                   + HyperbolicSecant(expr: Expression)
	 *                   + HyperbolicCotangent(expr: Expression)
	 *                   + InverseSine(expr: Expression)
	 *                   + InverseCosine(expr: Expression)
	 *                   + InverseTangent(expr: Expression)
	 *                   
	 */
	
	public static final Expression ZERO = new Number(0);
	public static final Expression ONE = new Number(1);
	public static final Expression TWO = new Number(2);
	
	/**
	 * Parses a String representation of an expression and returns an
	 * Expression object representative of the expression interpreted.
	 *
	 * @param expr A string representing the expression to be interpreted.
	 * @return the Expression representing the interpretation of the string
	 */
	public static Expression parse(String expr) {
		CharStream stream = new ANTLRInputStream(expr);
		ExpressionLexer lexer = new ExpressionLexer(stream);
		TokenStream tokens = new CommonTokenStream(lexer);
		ExpressionParser parser = new ExpressionParser(tokens);

		ParseTree tree = parser.expr();
		return ExpressionInterpreter.interpretParseTree(tree);
	}
	
	public static Expression getNumberExpression(double num) {
		return new Number(num);			
	}
	
	public static Expression getVariableExpression(String var) {
		return new Variable(var);
	}
	
	public static Expression abs(Expression expr) {
		return new AbsoluteValue(expr);
	}
	
	public static Expression sgn(Expression expr) {
		return new SignFunction(expr);
	}
	
	public static Expression sqrt(Expression expr) {
		return new SquareRoot(expr);
	}
	
	public static Expression exp(Expression expr) {
		return new ExponentialFunction(expr);
	}
	
	public static Expression ln(Expression expr) {
		return new NaturalLogarithm(expr);
	}
	
	public static Expression sin(Expression expr) {
		return new Sine(expr);
	}
	
	public static Expression cos(Expression expr) {
		return new Cosine(expr);
	}
	
	public static Expression tan(Expression expr) {
		return new Tangent(expr);
	}
	
	public static Expression csc(Expression expr) {
		return new Cosecant(expr);
	}
	
	public static Expression sec(Expression expr) {
		return new Secant(expr);
	}
	
	public static Expression cot(Expression expr) {
		return new Cotangent(expr);
	}
	
	public static Expression sinh(Expression expr) {
		return new HyperbolicSine(expr);
	}
	
	public static Expression cosh(Expression expr) {
		return new HyperbolicCosine(expr);
	}
	
	public static Expression tanh(Expression expr) {
		return new HyperbolicTangent(expr);
	}
	
	public static Expression csch(Expression expr) {
		return new HyperbolicCosecant(expr);
	}
	
	public static Expression sech(Expression expr) {
		return new HyperbolicSecant(expr);
	}
	
	public static Expression coth(Expression expr) {
		return new HyperbolicCotangent(expr);
	}
	
	public static Expression asin(Expression expr) {
		return new InverseSine(expr);
	}
	
	public static Expression acos(Expression expr) {
		return new InverseCosine(expr);
	}
	
	public static Expression atan(Expression expr) {
		return new InverseTangent(expr);
	}

	public default Expression add(Expression expr) {
		return new Addition(this, expr);
	}

	public default Expression subtract(Expression expr) {
		return new Subtraction(this, expr);
	}

	public default Expression multiply(Expression expr) {
		return new Multiplication(this, expr);
	}

	public default Expression divide(Expression expr) {
		return new Division(this, expr);
	}

	public default Expression pow(Expression expr) {
		return new Exponentiation(this, expr);
	}
	
	public default Expression negate() {
		return new Negation(this);
	}
	
	public default Expression sqr() {
		return new Exponentiation(this,TWO);
	}
	
	// ===============================================================
	
	public Expression derivative(String variable);
	
	/**
	 * Returns a string representation of the expression.
	 * @return a string representation of the expression
	 */
	@Override
	public String toString();
	
	/**
	 * Returns true if this object and the other object are both 
	 * Expression objects and are the same structural interpretation.
	 *
	 * @param other the object being compared to this expression 
	 * @return true, if this object is equal to other as described
	 */
	@Override
	public boolean equals(Object other);

	@Override
	public int hashCode();

}