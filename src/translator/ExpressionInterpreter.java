package translator;

import org.antlr.v4.runtime.tree.ParseTree;

import parser.ExpressionBaseVisitor;
import parser.ExpressionParser.FunctionExprContext;
import parser.ExpressionParser.NegateExprContext;
import parser.ExpressionParser.NumberExprContext;
import parser.ExpressionParser.OperationExprContext;
import parser.ExpressionParser.ParenthesisExprContext;
import parser.ExpressionParser.VariableExprContext;

public class ExpressionInterpreter extends ExpressionBaseVisitor<Expression> {
	
	private ExpressionInterpreter() {};
	private static final ExpressionInterpreter INTERPRETER = new ExpressionInterpreter();
	
	public static Expression interpretParseTree(ParseTree tree) {
		return INTERPRETER.visit(tree);
	}
	
	@Override
	public Expression visitNumberExpr(NumberExprContext ctx) {
		return Expression.getNumberExpression(Double.parseDouble(ctx.getText()));
	}
	
	@Override
	public Expression visitVariableExpr(VariableExprContext ctx) {
		return Expression.getVariableExpression(ctx.getText());
	}
	
	@Override
	public Expression visitFunctionExpr(FunctionExprContext ctx) {
		Expression expr = visit(ctx.expr());
		switch(ctx.func.getText()) {
		case "abs":		return Expression.abs(expr);
		case "sgn":		return Expression.sgn(expr);
		case "sqrt":	return Expression.sqrt(expr);
		case "exp":		return Expression.exp(expr);
		case "ln":		return Expression.ln(expr);
		case "sin":		return Expression.sin(expr);
		case "cos":		return Expression.cos(expr);
		case "tan":		return Expression.tan(expr);
		case "csc":		return Expression.csc(expr);
		case "sec":		return Expression.sec(expr);
		case "cot":		return Expression.cot(expr);
		case "sinh":	return Expression.sinh(expr);
		case "cosh":	return Expression.cosh(expr);
		case "tanh":	return Expression.tanh(expr);
		case "csch":	return Expression.csch(expr);
		case "sech":	return Expression.sech(expr);
		case "coth":	return Expression.coth(expr);
		case "asin":	return Expression.asin(expr);
		case "acos":	return Expression.acos(expr);
		case "atan":	return Expression.atan(expr);
		default:		throw new RuntimeException("Illegal function parsed.");
		}
	}
	
	@Override
	public Expression visitParenthesisExpr(ParenthesisExprContext ctx) {
		return visit(ctx.expr());
	}
	
	@Override
	public Expression visitNegateExpr(NegateExprContext ctx) {
		return visit(ctx.expr()).negate();
	}
	
	@Override
	public Expression visitOperationExpr(OperationExprContext ctx) {
		Expression left = visit(ctx.left), right = visit(ctx.right);
		switch(ctx.op.getText()) {
		case "+":	return left.add(right);
		case "-":	return left.subtract(right);
		case "*":	return left.multiply(right);
		case "/":	return left.divide(right);
		case "^":	return left.pow(right);
		default:	throw new RuntimeException("Illegal operation parsed.");
		}
	}

}
