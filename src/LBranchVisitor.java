import LocalType.LBranch;
import LocalType.LocalType;

public class LBranchVisitor extends ProgramBaseVisitor<LBranch> {

    @Override
    public LBranch visitLabel1(ProgramParser.Label1Context ctx) {
        LocalType continuation;
        expectedLocalTypeVisitor visitor = new expectedLocalTypeVisitor();
        continuation = visitor.visit(ctx.local());
        return new LBranch(ctx.label().getText(), ctx.BASETYPE().getText(), continuation);
    }

    @Override
    public LBranch visitLabel2(ProgramParser.Label2Context ctx) {
        LocalType continuation;
        expectedLocalTypeVisitor visitor = new expectedLocalTypeVisitor();
        continuation = visitor.visit(ctx.local());
        return new LBranch(null, ctx.BASETYPE().getText(), continuation);
    }

    @Override
    public LBranch visitLabel3(ProgramParser.Label3Context ctx) {
        LocalType continuation;
        expectedLocalTypeVisitor visitor = new expectedLocalTypeVisitor();
        continuation = visitor.visit(ctx.local());
        return new LBranch(ctx.label().getText(), "unit", continuation);
    }

}
