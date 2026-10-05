import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ProgramType.ProgramType;

public class progTypeVisitorDebugApp {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.print("Usage: file name\n");
        } else {
            String fileName = args[0];
            ProgramParser parser = getParser(fileName);
            ParseTree progTree = parser.prog();
            SystemToAST visitor = new SystemToAST();
            Map<String, ProgramType> systemsMap = visitor.visit(progTree);
            for (String keyString : systemsMap.keySet()) {
                System.out.print("Participant: " + keyString + " -> " + systemsMap.get(keyString).toString() + "; \n\n");
            }
        }
    }

    private static ProgramParser getParser(String fileName) {
        ProgramParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(fileName);
            ProgramLexer lexer = new ProgramLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new ProgramParser(tokens);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return parser;
    }
}
