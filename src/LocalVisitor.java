// Generated from ./src/Local.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LocalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LocalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Receive}
	 * labeled alternative in {@link LocalParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceive(LocalParser.ReceiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Send}
	 * labeled alternative in {@link LocalParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSend(LocalParser.SendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Recursion}
	 * labeled alternative in {@link LocalParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursion(LocalParser.RecursionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link LocalParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LocalParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code End}
	 * labeled alternative in {@link LocalParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(LocalParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiple}
	 * labeled alternative in {@link LocalParser#labelSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple(LocalParser.MultipleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleChoice}
	 * labeled alternative in {@link LocalParser#labelSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleChoice(LocalParser.SingleChoiceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Label1}
	 * labeled alternative in {@link LocalParser#labelType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel1(LocalParser.Label1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Label2}
	 * labeled alternative in {@link LocalParser#labelType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel2(LocalParser.Label2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Label3}
	 * labeled alternative in {@link LocalParser#labelType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel3(LocalParser.Label3Context ctx);
	/**
	 * Visit a parse tree produced by {@link LocalParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(LocalParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LocalParser#participant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParticipant(LocalParser.ParticipantContext ctx);
}