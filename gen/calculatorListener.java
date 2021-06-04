// Generated from /Users/chinmaykelkar/Code/Harrisburg/Theory of Computation/TOC-final-project/FinalProject/calculator.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculatorParser}.
 */
public interface calculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(calculatorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(calculatorParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(calculatorParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(calculatorParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code square}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSquare(calculatorParser.SquareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code square}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSquare(calculatorParser.SquareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(calculatorParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(calculatorParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code log}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLog(calculatorParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code log}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLog(calculatorParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubtract}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubtract(calculatorParser.AddSubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubtract}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubtract(calculatorParser.AddSubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code squareRoot}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSquareRoot(calculatorParser.SquareRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code squareRoot}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSquareRoot(calculatorParser.SquareRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trigFunctions}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrigFunctions(calculatorParser.TrigFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trigFunctions}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrigFunctions(calculatorParser.TrigFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivideMod}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivideMod(calculatorParser.MulDivideModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivideMod}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivideMod(calculatorParser.MulDivideModContext ctx);
}