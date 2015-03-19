// Generated from /home/litvin/IdeaProjects/ANTLR/Test.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TestParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull TestParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull TestParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull TestParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull TestParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull TestParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull TestParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull TestParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(@NotNull TestParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(@NotNull TestParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(@NotNull TestParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(@NotNull TestParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#devide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDevide(@NotNull TestParser.DevideContext ctx);
}