import java.util.ArrayList;
import java.util.List;

import ProgramType.ProgBranch;

public class programBranchVisitor extends ProgramBaseVisitor<List<ProgBranch>>{
    //TODO: possibile ottimizzazione cambiando grammatica di branch
    @Override
    public List<ProgBranch> visitMult(ProgramParser.MultContext ctx) {
        List<ProgBranch> ret = new ArrayList<>();
        programBranchTypeVisitor visitor = new programBranchTypeVisitor();
        for (int i = 0; i < ctx.branchType().size(); i++) {
            ProgBranch branch = visitor.visit(ctx.branchType(i));
            ret.add(branch);
        }

        return ret;
    }

    @Override
    public List<ProgBranch> visitSingle(ProgramParser.SingleContext ctx) {
        List<ProgBranch> ret = new ArrayList<>();
        programBranchTypeVisitor visitor = new programBranchTypeVisitor();
        ret.add(visitor.visit(ctx.branchType()));
        return ret;
    }

}
