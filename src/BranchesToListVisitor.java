import java.util.ArrayList;
import java.util.List;

import GlobalType.Branch;

public class BranchesToListVisitor extends GlobalBaseVisitor<List<Branch>>{

    @Override
    public List<Branch> visitMult(GlobalParser.MultContext ctx) {
        List<Branch> list = new ArrayList<>();
        ParseTreeBranchVisitor visitor = new ParseTreeBranchVisitor();
        for (int i = 1; i < ctx.getChildCount(); i = i + 2) {
            Branch branch = visitor.visit(ctx.getChild(i));
            list.add(branch);
        }
        return list;
    }

    @Override
    public List<Branch> visitSingle(GlobalParser.SingleContext ctx) {
        ParseTreeBranchVisitor visitor = new ParseTreeBranchVisitor();
        Branch branch = visitor.visit(ctx.getChild(0));
        List<Branch> list = new ArrayList<>();
        list.add(branch);
        return list;
    }
    
}
