import java.util.HashMap;
import java.util.Map;

import LocalType.LBranch;

public class LBranchesSetVisitor extends ProgramBaseVisitor<Map<String, LBranch>> {

    @Override
    public Map<String, LBranch> visitMultiple(ProgramParser.MultipleContext ctx) {
        Map<String, LBranch> ret = new HashMap<>();
        LBranchVisitor visitor = new LBranchVisitor();
        for (int i = 0; i < ctx.labelType().size(); i++) {
            LBranch branch = visitor.visit(ctx.labelType(i));
            ret.put(branch.label, branch);
        }
        return ret;
    }

    @Override
    public Map<String, LBranch> visitSingleChoice(ProgramParser.SingleChoiceContext ctx) {
        Map<String, LBranch> ret = new HashMap<>();
        LBranchVisitor visitor = new LBranchVisitor();
        LBranch branch = visitor.visit(ctx.labelType());
        ret.put(branch.label, branch);
        return ret;
    }
    
}
