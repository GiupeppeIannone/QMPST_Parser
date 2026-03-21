import GlobalType.Branch;
import GlobalType.GlobalType;

public class ParseTreeBranchVisitor extends GlobalBaseVisitor<Branch>{
    @Override
    public Branch visitLabel1(GlobalParser.Label1Context ctx) {
        String label = ctx.getChild(0).getText();
        String type = ctx.getChild(2).getText();
        ParseTreeToAST visitor = new ParseTreeToAST();
        GlobalType continuation = visitor.visit(ctx.getChild(5));
        Branch branch = new Branch(label, type, continuation);
        return branch;
    }

    @Override
    public Branch visitLabel2(GlobalParser.Label2Context ctx) {
        String label = null;
        String type = ctx.getChild(1).getText();
        ParseTreeToAST visitor = new ParseTreeToAST();
        GlobalType continuation = visitor.visit(ctx.getChild(4));
        Branch branch = new Branch(label, type, continuation);
        return branch;
    }

    @Override
    public Branch visitLabel3(GlobalParser.Label3Context ctx) {
        String label = ctx.getChild(0).getText();
        String type = "unit";
        ParseTreeToAST visitor = new ParseTreeToAST();
        GlobalType continuation = visitor.visit(ctx.getChild(2));
        Branch branch = new Branch(label, type, continuation);
        return branch;
    }
}
