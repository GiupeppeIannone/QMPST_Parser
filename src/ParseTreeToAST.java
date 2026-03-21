import GlobalType.*;;

public class ParseTreeToAST extends GlobalBaseVisitor<GlobalType>{
    @Override
    public GlobalType visitTransmission(GlobalParser.TransmissionContext ctx) {
        // TODO Auto-generated method stub
        return super.visitTransmission(ctx);
    }
    
    @Override
    public GlobalType visitRecursion(GlobalParser.RecursionContext ctx) {
        Recursion recursion = new Recursion(ctx.getChild(2).toString());
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

   /*  @Override
    public GlobalType visitLabelTypeSet(GlobalParser.LabelTypeSetContext ctx) {
        // TODO Auto-generated method stub
        return super.visitLabelTypeSet(ctx);
    }

    @Override
    public GlobalType visitLabel1(GlobalParser.Label1Context ctx) {
        // TODO Auto-generated method stub
        return super.visitLabel1(ctx);
    }

    @Override
    public GlobalType visitLabel2(GlobalParser.Label2Context ctx) {
        // TODO Auto-generated method stub
        return super.visitLabel2(ctx);
    }

    @Override
    public GlobalType visitLabel3(GlobalParser.Label3Context ctx) {
        // TODO Auto-generated method stub
        return super.visitLabel3(ctx);
    } */
}
