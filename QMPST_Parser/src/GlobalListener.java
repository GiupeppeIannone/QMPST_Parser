// Generated from ./Global.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GlobalParser}.
 */
public interface GlobalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GlobalParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GlobalParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlobalParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GlobalParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Transmission}
	 * labeled alternative in {@link GlobalParser#global}.
	 * @param ctx the parse tree
	 */
	void enterTransmission(GlobalParser.TransmissionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Transmission}
	 * labeled alternative in {@link GlobalParser#global}.
	 * @param ctx the parse tree
	 */
	void exitTransmission(GlobalParser.TransmissionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransmissionNoSet}
	 * labeled alternative in {@link GlobalParser#global}.
	 * @param ctx the parse tree
	 */
	void enterTransmissionNoSet(GlobalParser.TransmissionNoSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransmissionNoSet}
	 * labeled alternative in {@link GlobalParser#global}.
	 * @param ctx the parse tree
	 */
	void exitTransmissionNoSet(GlobalParser.TransmissionNoSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Recursion}
	 * labeled alternative in {@link GlobalParser#global}.
	 * @param ctx the parse tree
	 */
	void enterRecursion(GlobalParser.RecursionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Recursion}
	 * labeled alternative in {@link GlobalParser#global}.
	 * @param ctx the parse tree
	 */
	void exitRecursion(GlobalParser.RecursionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link GlobalParser#global}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GlobalParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link GlobalParser#global}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GlobalParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code End}
	 * labeled alternative in {@link GlobalParser#global}.
	 * @param ctx the parse tree
	 */
	void enterEnd(GlobalParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code End}
	 * labeled alternative in {@link GlobalParser#global}.
	 * @param ctx the parse tree
	 */
	void exitEnd(GlobalParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Label1}
	 * labeled alternative in {@link GlobalParser#labelType}.
	 * @param ctx the parse tree
	 */
	void enterLabel1(GlobalParser.Label1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Label1}
	 * labeled alternative in {@link GlobalParser#labelType}.
	 * @param ctx the parse tree
	 */
	void exitLabel1(GlobalParser.Label1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Label2}
	 * labeled alternative in {@link GlobalParser#labelType}.
	 * @param ctx the parse tree
	 */
	void enterLabel2(GlobalParser.Label2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Label2}
	 * labeled alternative in {@link GlobalParser#labelType}.
	 * @param ctx the parse tree
	 */
	void exitLabel2(GlobalParser.Label2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Label3}
	 * labeled alternative in {@link GlobalParser#labelType}.
	 * @param ctx the parse tree
	 */
	void enterLabel3(GlobalParser.Label3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Label3}
	 * labeled alternative in {@link GlobalParser#labelType}.
	 * @param ctx the parse tree
	 */
	void exitLabel3(GlobalParser.Label3Context ctx);
	/**
	 * Enter a parse tree produced by {@link GlobalParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(GlobalParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlobalParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(GlobalParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GlobalParser#participant}.
	 * @param ctx the parse tree
	 */
	void enterParticipant(GlobalParser.ParticipantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GlobalParser#participant}.
	 * @param ctx the parse tree
	 */
	void exitParticipant(GlobalParser.ParticipantContext ctx);
}