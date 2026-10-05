import java.util.List;

import ProgramType.*;

public class ProcessToAST extends ProgramBaseVisitor<ProgramType> {
    
    @Override
    public ProgramType visitQbGeneration(ProgramParser.QbGenerationContext ctx) {
        String variable = ctx.VAR().getText();
        ProgramType cont = this.visit(ctx.process());
        Generation retValue = new Generation(variable, cont);
        return retValue;
    }
    
    @Override
    public ProgramType visitBranching(ProgramParser.BranchingContext ctx) {
        programBranchVisitor visitor = new programBranchVisitor();
        String participant = ctx.participant().getText();
        List<ProgBranch> branchesList = visitor.visit(ctx.branch());
        Branching ret = new Branching(participant, branchesList);
        return ret;
    }

    @Override
    public ProgramType visitCall(ProgramParser.CallContext ctx) {
        String procName = ctx.PROCNAME().getText();
        int i = ctx.expression().size();
        String[] arguments = new String[i];
        for (int j = 0; j < i; j++) {
            arguments[j] = ctx.expression(j).getText();
        }
        Call ret = new Call(procName, arguments);
        return ret;
    }

    @Override
    public ProgramType visitConditional(ProgramParser.ConditionalContext ctx) {
        String expression = ctx.expression().getText();
        ProgramType option1 = this.visit(ctx.process(0));
        ProgramType option2 = this.visit(ctx.process(1));
        Conditional ret = new Conditional(expression, option1, option2);
        return ret;
    }

    @Override
    public ProgramType visitControlledNot(ProgramParser.ControlledNotContext ctx) {
        String opType = "CNot";
        String[] vars = new String[2];
        vars[0] = ctx.VAR(0).getText();
        vars[1] = ctx.VAR(1).getText();
        ProgramType cont = this.visit(ctx.process());
        UnitOp ret = new UnitOp(opType, vars, cont);
        return ret;
    }

    @Override
    public ProgramType visitDefinition(ProgramParser.DefinitionContext ctx) {
        String procName = ctx.PROCNAME().getText();
        int i = ctx.VAR().size();
        String[] parameters = new String[i];
        for (int j = 0; j < i; j++) {
            parameters[j] = ctx.VAR(j).getText();
        }
        ProgramType proc = this.visit(ctx.process(0));
        ProgramType prog = this.visit(ctx.process(1));
        Definition ret = new Definition(procName, parameters, proc, prog);
        return ret;
    }

    @Override
    public ProgramType visitHadamar(ProgramParser.HadamarContext ctx) {
        String opType = "H";
        String[] var = new String[1];
        var[0] = ctx.VAR().getText();
        ProgramType cont = this.visit(ctx.process());
        UnitOp ret = new UnitOp(opType, var, cont);
        return ret;
    }

    @Override
    public ProgramType visitInaction(ProgramParser.InactionContext ctx) {
        int i = ctx.VAR().size();
        String[] vars = new String[i];
        for (int j = 0; j < i; j++) {
            //probabilmente necessario controllo della presenza di: "-q-" nei token
            vars[j] = ctx.VAR(j).getText();
        }
        Inaction ret = new Inaction(vars);
        return ret;
    }


    @Override
    public ProgramType visitMeasurement(ProgramParser.MeasurementContext ctx) {
        String resVar = ctx.VAR(0).getText();
        int i = ctx.VAR().size() - 1;
        String[] measVars = new String[i];
        for (int j = 0; j < i; j++) {
            measVars[j] = ctx.VAR(j + 1).getText();
        }
        ProgramType continuation = this.visit(ctx.process());
        Measurement ret = new Measurement(resVar, measVars, continuation);
        return ret;
    }

    @Override
    public ProgramType visitPauliTransformation(ProgramParser.PauliTransformationContext ctx) {
        String opType = "σ_{" + ctx.PAULI().getText() + "}";
        String[] var = new String[1]; 
        var[0] = ctx.VAR().getText();
        ProgramType cont = this.visit(ctx.process());
        UnitOp ret = new UnitOp(opType, var, cont);
        return ret;
    }

    @Override
    public ProgramType visitSelection(ProgramParser.SelectionContext ctx) {
        String participantString = ctx.participant().getText();
        String labelString = ctx.label() != null ? ctx.label().getText() : null;
        int i = ctx.expression().size();
        String[] expressionArray = new String[i];
        for (int j = 0; j < i; j++) {
            expressionArray[j] = ctx.expression(j).getText();
        }

        ProgramType cont = this.visit(ctx.process());
        Selection ret = new Selection(participantString, labelString, expressionArray, cont);
        return ret;
    }

    @Override
    public ProgramType visitUnitaryOp(ProgramParser.UnitaryOpContext ctx) {
        return this.visit(ctx.unitop());
    }
    
    
}
