import java.util.HashMap;
import java.util.Map;

import ProgramType.ProgramType;

public class SystemToAST extends ProgramBaseVisitor<Map<String, ProgramType>> {

    @Override
    public Map<String, ProgramType> visitMultipartySystems(ProgramParser.MultipartySystemsContext ctx) {
        String participantString = ctx.participant().getText();
        ProcessToAST visitor = new ProcessToAST();
        ProgramType process = visitor.visit(ctx.process());
        Map<String, ProgramType> ret = new HashMap<>();
        ret.put(participantString, process);
        return ret;
    }

    @Override
    public Map<String, ProgramType> visitProg(ProgramParser.ProgContext ctx) {
        Map<String, ProgramType> ret = new HashMap<>();
        for (int j = 0; j < ctx.multipartySystems().size(); j++) {
            ret.putAll(this.visit(ctx.multipartySystems(j)));
        }
        
        return ret;
    }

    
    
}
