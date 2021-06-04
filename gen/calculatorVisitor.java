// Generated from /Users/chinmaykelkar/Code/Harrisburg/Theory of Computation/TOC-final-project/FinalProject/calculator.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calculatorParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(calculatorParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(calculatorParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code square}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquare(calculatorParser.SquareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(calculatorParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code log}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(calculatorParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubtract}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubtract(calculatorParser.AddSubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code squareRoot}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquareRoot(calculatorParser.SquareRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trigFunctions}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigFunctions(calculatorParser.TrigFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivideMod}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivideMod(calculatorParser.MulDivideModContext ctx);
}