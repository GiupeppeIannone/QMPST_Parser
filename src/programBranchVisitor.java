import java.util.HashMap;
import java.util.Map;

import ProgramType.ProgBranch;

public class programBranchVisitor extends ProgramBaseVisitor<Map<String, ProgBranch>>{
    //TODO: possibile ottimizzazione cambiando grammatica di branch
    @Override
    public Map<String, ProgBranch> visitMult(ProgramParser.MultContext ctx) {
        Map<String, ProgBranch> ret = new HashMap<>();
        programBranchTypeVisitor visitor = new programBranchTypeVisitor();
        for (int i = 0; i < ctx.branchType().size(); i++) {
            ProgBranch branch = visitor.visit(ctx.branchType(i));
            ret.put(branch.label, branch);
        }

        return ret;
    }

    @Override
    public Map<String, ProgBranch> visitSingle(ProgramParser.SingleContext ctx) {
        Map<String, ProgBranch> ret = new HashMap<>();
        programBranchTypeVisitor visitor = new programBranchTypeVisitor();
        ProgBranch tmp = visitor.visit(ctx.branchType());
        ret.put(tmp.label, tmp);
        return ret;
    }

}
