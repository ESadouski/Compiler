// Generated from /home/litvin/IdeaProjects/ANTLR/Test.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestParser}.
 */
public interface TestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull TestParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull TestParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull TestParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull TestParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull TestParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull TestParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull TestParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull TestParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull TestParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull TestParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull TestParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull TestParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull TestParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull TestParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull TestParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull TestParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(@NotNull TestParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(@NotNull TestParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(@NotNull TestParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(@NotNull TestParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(@NotNull TestParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(@NotNull TestParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#devide}.
	 * @param ctx the parse tree
	 */
	void enterDevide(@NotNull TestParser.DevideContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#devide}.
	 * @param ctx the parse tree
	 */
	void exitDevide(@NotNull TestParser.DevideContext ctx);
}