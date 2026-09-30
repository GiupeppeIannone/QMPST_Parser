// Generated from ./src/Program.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgramParser}.
 */
public interface ProgramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgramParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ProgramParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ProgramParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#multipartySystems}.
	 * @param ctx the parse tree
	 */
	void enterMultipartySystems(ProgramParser.MultipartySystemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#multipartySystems}.
	 * @param ctx the parse tree
	 */
	void exitMultipartySystems(ProgramParser.MultipartySystemsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QbGeneration}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void enterQbGeneration(ProgramParser.QbGenerationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QbGeneration}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void exitQbGeneration(ProgramParser.QbGenerationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Measurement}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void enterMeasurement(ProgramParser.MeasurementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Measurement}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void exitMeasurement(ProgramParser.MeasurementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Branching}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void enterBranching(ProgramParser.BranchingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Branching}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void exitBranching(ProgramParser.BranchingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Selection}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void enterSelection(ProgramParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Selection}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void exitSelection(ProgramParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Conditional}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void enterConditional(ProgramParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Conditional}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void exitConditional(ProgramParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Definition}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(ProgramParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Definition}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(ProgramParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void enterCall(ProgramParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void exitCall(ProgramParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnitaryOp}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void enterUnitaryOp(ProgramParser.UnitaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnitaryOp}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void exitUnitaryOp(ProgramParser.UnitaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Inaction}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void enterInaction(ProgramParser.InactionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Inaction}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 */
	void exitInaction(ProgramParser.InactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(ProgramParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(ProgramParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BranchLabel1}
	 * labeled alternative in {@link ProgramParser#branchType}.
	 * @param ctx the parse tree
	 */
	void enterBranchLabel1(ProgramParser.BranchLabel1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BranchLabel1}
	 * labeled alternative in {@link ProgramParser#branchType}.
	 * @param ctx the parse tree
	 */
	void exitBranchLabel1(ProgramParser.BranchLabel1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code BranchLabel2}
	 * labeled alternative in {@link ProgramParser#branchType}.
	 * @param ctx the parse tree
	 */
	void enterBranchLabel2(ProgramParser.BranchLabel2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BranchLabel2}
	 * labeled alternative in {@link ProgramParser#branchType}.
	 * @param ctx the parse tree
	 */
	void exitBranchLabel2(ProgramParser.BranchLabel2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code BranchLabel3}
	 * labeled alternative in {@link ProgramParser#branchType}.
	 * @param ctx the parse tree
	 */
	void enterBranchLabel3(ProgramParser.BranchLabel3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BranchLabel3}
	 * labeled alternative in {@link ProgramParser#branchType}.
	 * @param ctx the parse tree
	 */
	void exitBranchLabel3(ProgramParser.BranchLabel3Context ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ProgramParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ProgramParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Hadamar}
	 * labeled alternative in {@link ProgramParser#unitop}.
	 * @param ctx the parse tree
	 */
	void enterHadamar(ProgramParser.HadamarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Hadamar}
	 * labeled alternative in {@link ProgramParser#unitop}.
	 * @param ctx the parse tree
	 */
	void exitHadamar(ProgramParser.HadamarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ControlledNot}
	 * labeled alternative in {@link ProgramParser#unitop}.
	 * @param ctx the parse tree
	 */
	void enterControlledNot(ProgramParser.ControlledNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ControlledNot}
	 * labeled alternative in {@link ProgramParser#unitop}.
	 * @param ctx the parse tree
	 */
	void exitControlledNot(ProgramParser.ControlledNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PauliTransformation}
	 * labeled alternative in {@link ProgramParser#unitop}.
	 * @param ctx the parse tree
	 */
	void enterPauliTransformation(ProgramParser.PauliTransformationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PauliTransformation}
	 * labeled alternative in {@link ProgramParser#unitop}.
	 * @param ctx the parse tree
	 */
	void exitPauliTransformation(ProgramParser.PauliTransformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(ProgramParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(ProgramParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#participant}.
	 * @param ctx the parse tree
	 */
	void enterParticipant(ProgramParser.ParticipantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#participant}.
	 * @param ctx the parse tree
	 */
	void exitParticipant(ProgramParser.ParticipantContext ctx);
}