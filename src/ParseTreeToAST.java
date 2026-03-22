import java.util.List;

import GlobalType.*;;

public class ParseTreeToAST extends GlobalBaseVisitor<GlobalType>{

    

    @Override
    public GlobalType visitProg(GlobalParser.ProgContext ctx) {
        GlobalType global = this.visit(ctx.getChild(0));
        return global;
    }

    @Override
    public GlobalType visitTransmission(GlobalParser.TransmissionContext ctx) {
        String participant1 = ctx.getChild(0).getText();
        String participant2 = ctx.getChild(2).getText();
        BranchesToListVisitor visitor = new BranchesToListVisitor();
        List<Branch> list = visitor.visit(ctx.getChild(4));
        Transmission transmission = new Transmission(participant1, participant2, list);
        return transmission;
    }
    
    @Override
    public GlobalType visitRecursion(GlobalParser.RecursionContext ctx) {
        String variable = ctx.getChild(1).getText();
        //ParseTreeToAST visitor = new ParseTreeToAST();
        GlobalType continuation = this.visit(ctx.getChild(3));
        Recursion recursion = new Recursion(variable, continuation);
        return recursion;
    }
    
    @Override
    public GlobalType visitVariable(GlobalParser.VariableContext ctx) {
        Variable variable = new Variable(ctx.getChild(0).toString());
        return variable;
    }

    @Override
    public GlobalType visitEnd(GlobalParser.EndContext ctx) {
        End end = new End();
        return end;
    }

    

    
}
