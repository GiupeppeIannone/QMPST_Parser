// Generated from ./src/Program.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProgramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProgramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProgramParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ProgramParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#multipartySystems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipartySystems(ProgramParser.MultipartySystemsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QbGeneration}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQbGeneration(ProgramParser.QbGenerationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Measurement}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasurement(ProgramParser.MeasurementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Branching}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranching(ProgramParser.BranchingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Selection}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection(ProgramParser.SelectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Conditional}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(ProgramParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Definition}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(ProgramParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(ProgramParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnitaryOp}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitaryOp(ProgramParser.UnitaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Inaction}
	 * labeled alternative in {@link ProgramParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInaction(ProgramParser.InactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(ProgramParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link ProgramParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(ProgramParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Single}
	 * labeled alternative in {@link ProgramParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle(ProgramParser.SingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BranchLabel1}
	 * labeled alternative in {@link ProgramParser#branchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranchLabel1(ProgramParser.BranchLabel1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code BranchLabel2}
	 * labeled alternative in {@link ProgramParser#branchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranchLabel2(ProgramParser.BranchLabel2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code BranchLabel3}
	 * labeled alternative in {@link ProgramParser#branchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranchLabel3(ProgramParser.BranchLabel3Context ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(ProgramParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#participant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParticipant(ProgramParser.ParticipantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ProgramParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Hadamar}
	 * labeled alternative in {@link ProgramParser#unitop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHadamar(ProgramParser.HadamarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ControlledNot}
	 * labeled alternative in {@link ProgramParser#unitop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlledNot(ProgramParser.ControlledNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PauliTransformation}
	 * labeled alternative in {@link ProgramParser#unitop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPauliTransformation(ProgramParser.PauliTransformationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Receive}
	 * labeled alternative in {@link ProgramParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceive(ProgramParser.ReceiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Send}
	 * labeled alternative in {@link ProgramParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSend(ProgramParser.SendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Recursion}
	 * labeled alternative in {@link ProgramParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursion(ProgramParser.RecursionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ProgramParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ProgramParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code End}
	 * labeled alternative in {@link ProgramParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(ProgramParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiple}
	 * labeled alternative in {@link ProgramParser#labelSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple(ProgramParser.MultipleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleChoice}
	 * labeled alternative in {@link ProgramParser#labelSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleChoice(ProgramParser.SingleChoiceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Label1}
	 * labeled alternative in {@link ProgramParser#labelType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel1(ProgramParser.Label1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Label2}
	 * labeled alternative in {@link ProgramParser#labelType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel2(ProgramParser.Label2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Label3}
	 * labeled alternative in {@link ProgramParser#labelType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel3(ProgramParser.Label3Context ctx);
}