import java.util.Set;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import GlobalType.*;
import ProjectionAlgorithm.*;

public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.print("Usage: file name\n");
        } else {
            String fileName = args[0];
            GlobalParser parser = getParser(fileName);
            ParseTree antlrTree = parser.prog();
            ParseTreeToAST visitor = new ParseTreeToAST();
            GlobalType global = visitor.visit(antlrTree);
            //debug, per ora stampa solo l'AST derivato dal parseTree di Antlr
            System.out.print(global.toString());
            //prova di stampa partecipanti {pt(G)}
            ASTParticipantVisitor pt = new ASTParticipantVisitor();
            Set<String> participants = global.accept(pt);
            for (String string : participants) {
                System.out.print(string+"\n");
            }
        }
    }

    private static GlobalParser getParser(String fileName) {
        GlobalParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(fileName);
            GlobalLexer lexer = new GlobalLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new GlobalParser(tokens);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return parser;
    }
}
