import ProgramType.ProgBranch;
import ProgramType.ProgramType;

public class programBranchTypeVisitor extends ProgramBaseVisitor<ProgBranch>{
    //TODO: possibile ottimizzazione cambiando grammatica di branchtype
    @Override
    public ProgBranch visitBranchLabel1(ProgramParser.BranchLabel1Context ctx) {
        String labelString = ctx.label().getText();
        int i = ctx.VAR().size();
        String[] vars = new String[i];
        for (int j = 0; j < i; j++) {
            vars[j] = ctx.VAR(j).getText();
        }
        ProcessToAST visitor = new ProcessToAST();
        ProgramType continuation = visitor.visit(ctx.process());
        ProgBranch ret = new ProgBranch(labelString, vars, continuation);
        return ret;
    }

    @Override
    public ProgBranch visitBranchLabel2(ProgramParser.BranchLabel2Context ctx) {
        String labelString = null;
        int i = ctx.VAR().size();
        String[] vars = new String[i];
        for (int j = 0; j < i; j++) {
            vars[j] = ctx.VAR(j).getText();
        }
        ProcessToAST visitor = new ProcessToAST();
        ProgramType continuation = visitor.visit(ctx.process());
        ProgBranch ret = new ProgBranch(labelString, vars, continuation);
        return ret;
    }

    @Override
    public ProgBranch visitBranchLabel3(ProgramParser.BranchLabel3Context ctx) {
        String labelString = ctx.label().getText();
        String[] vars = null;
        ProcessToAST visitor = new ProcessToAST();
        ProgramType continuation = visitor.visit(ctx.process());
        ProgBranch ret = new ProgBranch(labelString, vars, continuation);
        return ret;
    }
    
}
