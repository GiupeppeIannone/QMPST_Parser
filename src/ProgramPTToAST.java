import ProgramType.*;

public class ProgramPTToAST extends ProgramBaseVisitor<ProgramType> {
    
    @Override
    public ProgramType visitProg(ProgramParser.ProgContext ctx) {
        // TODO Auto-generated method stub
        return super.visitProg(ctx);
    }

    @Override
    public ProgramType visitMultipartySystems(ProgramParser.MultipartySystemsContext ctx) {
        // TODO Auto-generated method stub
        return super.visitMultipartySystems(ctx);
    }        
    
    @Override
    public ProgramType visitQbGeneration(ProgramParser.QbGenerationContext ctx) {
        // TODO Auto-generated method stub
        return super.visitQbGeneration(ctx);
    }

    @Override
    public ProgramType visitMeasurement(ProgramParser.MeasurementContext ctx) {
        // TODO Auto-generated method stub
        return super.visitMeasurement(ctx);
    }        

    @Override
    public ProgramType visitBranching(ProgramParser.BranchingContext ctx) {
        // TODO Auto-generated method stub
        return super.visitBranching(ctx);
    }                
    
    @Override
    public ProgramType visitSelection(ProgramParser.SelectionContext ctx) {
        // TODO Auto-generated method stub
        return super.visitSelection(ctx);
    }    
    
    @Override
    public ProgramType visitConditional(ProgramParser.ConditionalContext ctx) {
        // TODO Auto-generated method stub
        return super.visitConditional(ctx);
    }            
    
    @Override
    public ProgramType visitDefinition(ProgramParser.DefinitionContext ctx) {
        // TODO Auto-generated method stub
        return super.visitDefinition(ctx);
    }            
    
    @Override
    public ProgramType visitCall(ProgramParser.CallContext ctx) {
        // TODO Auto-generated method stub
        return super.visitCall(ctx);
    }                    
    
    @Override
    public ProgramType visitUnitaryOp(ProgramParser.UnitaryOpContext ctx) {
        // TODO Auto-generated method stub
        return super.visitUnitaryOp(ctx);
    }
    
    @Override
    public ProgramType visitInaction(ProgramParser.InactionContext ctx) {
        // TODO Auto-generated method stub
        return super.visitInaction(ctx);
    }            

    @Override
    public ProgramType visitBranch(ProgramParser.BranchContext ctx) {
        // TODO Auto-generated method stub
        return super.visitBranch(ctx);
    }                                    
    
    @Override
    public ProgramType visitBranchLabel1(ProgramParser.BranchLabel1Context ctx) {
        // TODO Auto-generated method stub
        return super.visitBranchLabel1(ctx);
    }                                

    @Override
    public ProgramType visitBranchLabel2(ProgramParser.BranchLabel2Context ctx) {
        // TODO Auto-generated method stub
        return super.visitBranchLabel2(ctx);
    }                                

    @Override
    public ProgramType visitBranchLabel3(ProgramParser.BranchLabel3Context ctx) {
        // TODO Auto-generated method stub
        return super.visitBranchLabel3(ctx);
    }                                

    @Override
    public ProgramType visitExpression(ProgramParser.ExpressionContext ctx) {
        // TODO Auto-generated method stub
        return super.visitExpression(ctx);
    }            

    @Override
    public ProgramType visitHadamar(ProgramParser.HadamarContext ctx) {
        // TODO Auto-generated method stub
        return super.visitHadamar(ctx);
    }            

    @Override
    public ProgramType visitControlledNot(ProgramParser.ControlledNotContext ctx) {
        // TODO Auto-generated method stub
        return super.visitControlledNot(ctx);
    }                    

    @Override
    public ProgramType visitPauliTransformation(ProgramParser.PauliTransformationContext ctx) {
        // TODO Auto-generated method stub
        return super.visitPauliTransformation(ctx);
    }        

    @Override
    public ProgramType visitLabel(ProgramParser.LabelContext ctx) {
        // TODO Auto-generated method stub
        return super.visitLabel(ctx);
    }            

    @Override
    public ProgramType visitParticipant(ProgramParser.ParticipantContext ctx) {
        // TODO Auto-generated method stub
        return super.visitParticipant(ctx);
    }        

}
