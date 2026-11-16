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
	 * Enter a parse tree produced by {@link ProgramParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(ProgramParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(ProgramParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link ProgramParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterMult(ProgramParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link ProgramParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitMult(ProgramParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Single}
	 * labeled alternative in {@link ProgramParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterSingle(ProgramParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Single}
	 * labeled alternative in {@link ProgramParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitSingle(ProgramParser.SingleContext ctx);
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
	 * Enter a parse tree produced by the {@code Receive}
	 * labeled alternative in {@link ProgramParser#local}.
	 * @param ctx the parse tree
	 */
	void enterReceive(ProgramParser.ReceiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Receive}
	 * labeled alternative in {@link ProgramParser#local}.
	 * @param ctx the parse tree
	 */
	void exitReceive(ProgramParser.ReceiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Send}
	 * labeled alternative in {@link ProgramParser#local}.
	 * @param ctx the parse tree
	 */
	void enterSend(ProgramParser.SendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Send}
	 * labeled alternative in {@link ProgramParser#local}.
	 * @param ctx the parse tree
	 */
	void exitSend(ProgramParser.SendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Recursion}
	 * labeled alternative in {@link ProgramParser#local}.
	 * @param ctx the parse tree
	 */
	void enterRecursion(ProgramParser.RecursionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Recursion}
	 * labeled alternative in {@link ProgramParser#local}.
	 * @param ctx the parse tree
	 */
	void exitRecursion(ProgramParser.RecursionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ProgramParser#local}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ProgramParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ProgramParser#local}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ProgramParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code End}
	 * labeled alternative in {@link ProgramParser#local}.
	 * @param ctx the parse tree
	 */
	void enterEnd(ProgramParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code End}
	 * labeled alternative in {@link ProgramParser#local}.
	 * @param ctx the parse tree
	 */
	void exitEnd(ProgramParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiple}
	 * labeled alternative in {@link ProgramParser#labelSet}.
	 * @param ctx the parse tree
	 */
	void enterMultiple(ProgramParser.MultipleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiple}
	 * labeled alternative in {@link ProgramParser#labelSet}.
	 * @param ctx the parse tree
	 */
	void exitMultiple(ProgramParser.MultipleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleChoice}
	 * labeled alternative in {@link ProgramParser#labelSet}.
	 * @param ctx the parse tree
	 */
	void enterSingleChoice(ProgramParser.SingleChoiceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleChoice}
	 * labeled alternative in {@link ProgramParser#labelSet}.
	 * @param ctx the parse tree
	 */
	void exitSingleChoice(ProgramParser.SingleChoiceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Label1}
	 * labeled alternative in {@link ProgramParser#labelType}.
	 * @param ctx the parse tree
	 */
	void enterLabel1(ProgramParser.Label1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Label1}
	 * labeled alternative in {@link ProgramParser#labelType}.
	 * @param ctx the parse tree
	 */
	void exitLabel1(ProgramParser.Label1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Label2}
	 * labeled alternative in {@link ProgramParser#labelType}.
	 * @param ctx the parse tree
	 */
	void enterLabel2(ProgramParser.Label2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Label2}
	 * labeled alternative in {@link ProgramParser#labelType}.
	 * @param ctx the parse tree
	 */
	void exitLabel2(ProgramParser.Label2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Label3}
	 * labeled alternative in {@link ProgramParser#labelType}.
	 * @param ctx the parse tree
	 */
	void enterLabel3(ProgramParser.Label3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Label3}
	 * labeled alternative in {@link ProgramParser#labelType}.
	 * @param ctx the parse tree
	 */
	void exitLabel3(ProgramParser.Label3Context ctx);
}