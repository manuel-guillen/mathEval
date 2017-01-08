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
	 *                 	 + Variable(name: String)
	 *                   + Addition(left, right: Expression)
	 *                   + Subtraction(left, right: Expression)
	 *                   + Multiplication(left, right: Expression)
	 *                   + Division(left, right: Expression)
	 *                   + Exponentiation(left, right: Expression)
	 */
	
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
	
	public static Expression getNumberExpression(String num) {
		return new Number(num);			
	}
	
	public static Expression getVariableExpression(String var) {
		return new Variable(var);
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
	
	// ===============================================================
	
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