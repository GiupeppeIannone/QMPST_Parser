import LocalType.LEnd;
import LocalType.LRecursion;
import LocalType.LVariable;
import LocalType.LocalType;
import LocalType.Receive;
import LocalType.Send;


public class expectedLocalTypeVisitor extends ProgramBaseVisitor<LocalType>{

    @Override
    public LocalType visitEnd(ProgramParser.EndContext ctx) {
        return new LEnd();
    }

    @Override
    public LocalType visitReceive(ProgramParser.ReceiveContext ctx) {
        LBranchesSetVisitor visitor = new LBranchesSetVisitor();
        return new Receive(ctx.participant().getText(), visitor.visit(ctx.labelSet()));
    }

    @Override
    public LocalType visitRecursion(ProgramParser.RecursionContext ctx) {
        return new LRecursion(ctx.TYPEVAR().getText(), this.visit(ctx.local()));
    }

    @Override
    public LocalType visitSend(ProgramParser.SendContext ctx) {
        LBranchesSetVisitor visitor = new LBranchesSetVisitor();
        return new Send(ctx.participant().getText(), visitor.visit(ctx.labelSet()));
    }

    @Override
    public LocalType visitVariable(ProgramParser.VariableContext ctx) {
        return new LVariable(ctx.TYPEVAR().getText());
    }
    
}
