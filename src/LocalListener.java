// Generated from ./src/Local.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LocalParser}.
 */
public interface LocalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Receive}
	 * labeled alternative in {@link LocalParser#local}.
	 * @param ctx the parse tree
	 */
	void enterReceive(LocalParser.ReceiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Receive}
	 * labeled alternative in {@link LocalParser#local}.
	 * @param ctx the parse tree
	 */
	void exitReceive(LocalParser.ReceiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Send}
	 * labeled alternative in {@link LocalParser#local}.
	 * @param ctx the parse tree
	 */
	void enterSend(LocalParser.SendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Send}
	 * labeled alternative in {@link LocalParser#local}.
	 * @param ctx the parse tree
	 */
	void exitSend(LocalParser.SendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Recursion}
	 * labeled alternative in {@link LocalParser#local}.
	 * @param ctx the parse tree
	 */
	void enterRecursion(LocalParser.RecursionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Recursion}
	 * labeled alternative in {@link LocalParser#local}.
	 * @param ctx the parse tree
	 */
	void exitRecursion(LocalParser.RecursionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link LocalParser#local}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LocalParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link LocalParser#local}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LocalParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code End}
	 * labeled alternative in {@link LocalParser#local}.
	 * @param ctx the parse tree
	 */
	void enterEnd(LocalParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code End}
	 * labeled alternative in {@link LocalParser#local}.
	 * @param ctx the parse tree
	 */
	void exitEnd(LocalParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiple}
	 * labeled alternative in {@link LocalParser#labelSet}.
	 * @param ctx the parse tree
	 */
	void enterMultiple(LocalParser.MultipleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiple}
	 * labeled alternative in {@link LocalParser#labelSet}.
	 * @param ctx the parse tree
	 */
	void exitMultiple(LocalParser.MultipleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleChoice}
	 * labeled alternative in {@link LocalParser#labelSet}.
	 * @param ctx the parse tree
	 */
	void enterSingleChoice(LocalParser.SingleChoiceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleChoice}
	 * labeled alternative in {@link LocalParser#labelSet}.
	 * @param ctx the parse tree
	 */
	void exitSingleChoice(LocalParser.SingleChoiceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Label1}
	 * labeled alternative in {@link LocalParser#labelType}.
	 * @param ctx the parse tree
	 */
	void enterLabel1(LocalParser.Label1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Label1}
	 * labeled alternative in {@link LocalParser#labelType}.
	 * @param ctx the parse tree
	 */
	void exitLabel1(LocalParser.Label1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Label2}
	 * labeled alternative in {@link LocalParser#labelType}.
	 * @param ctx the parse tree
	 */
	void enterLabel2(LocalParser.Label2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Label2}
	 * labeled alternative in {@link LocalParser#labelType}.
	 * @param ctx the parse tree
	 */
	void exitLabel2(LocalParser.Label2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Label3}
	 * labeled alternative in {@link LocalParser#labelType}.
	 * @param ctx the parse tree
	 */
	void enterLabel3(LocalParser.Label3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Label3}
	 * labeled alternative in {@link LocalParser#labelType}.
	 * @param ctx the parse tree
	 */
	void exitLabel3(LocalParser.Label3Context ctx);
	/**
	 * Enter a parse tree produced by {@link LocalParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(LocalParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LocalParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(LocalParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LocalParser#participant}.
	 * @param ctx the parse tree
	 */
	void enterParticipant(LocalParser.ParticipantContext ctx);
	/**
	 * Exit a parse tree produced by {@link LocalParser#participant}.
	 * @param ctx the parse tree
	 */
	void exitParticipant(LocalParser.ParticipantContext ctx);
}