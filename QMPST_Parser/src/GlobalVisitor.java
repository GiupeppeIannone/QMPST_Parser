// Generated from ./Global.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GlobalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GlobalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GlobalParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GlobalParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Transmission}
	 * labeled alternative in {@link GlobalParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransmission(GlobalParser.TransmissionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransmissionNoSet}
	 * labeled alternative in {@link GlobalParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransmissionNoSet(GlobalParser.TransmissionNoSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Recursion}
	 * labeled alternative in {@link GlobalParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursion(GlobalParser.RecursionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link GlobalParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GlobalParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code End}
	 * labeled alternative in {@link GlobalParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(GlobalParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Label1}
	 * labeled alternative in {@link GlobalParser#labelType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel1(GlobalParser.Label1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Label2}
	 * labeled alternative in {@link GlobalParser#labelType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel2(GlobalParser.Label2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Label3}
	 * labeled alternative in {@link GlobalParser#labelType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel3(GlobalParser.Label3Context ctx);
	/**
	 * Visit a parse tree produced by {@link GlobalParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(GlobalParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GlobalParser#participant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParticipant(GlobalParser.ParticipantContext ctx);
}