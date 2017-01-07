package translator;

import translator.expressions.*;
import translator.expressions.Number;

/**
 * An immutable data type representing the structure of a mathematical expression consisting 
 * of addition, subtraction, multiplication, division, and exponentiation of nonnegative
 * integers and variables.
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
		// TODO Implement expression parsing.
		return null;
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