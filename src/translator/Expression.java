package translator;

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