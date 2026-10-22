package TypeChecker;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import GlobalType.GlobalType;
import LocalType.LocalType;
import ProgramType.ProgramType;
import ProjectionAlgorithm.ASTParticipantVisitor;
import ProjectionAlgorithm.ProjectionVisitor;

public class TypeChecker {
    public GlobalType globalType;
    public Map<String, ProgramType> programTypeMap;
    public Map<String, LocalType> localTypesMap;

    public TypeChecker(GlobalType globalType, Map<String, ProgramType> programTypeMap) {
        //TODO: mettere delle guard condition;
        this.globalType = globalType;
        this.programTypeMap = new HashMap<>();
        this.programTypeMap.putAll(programTypeMap);
        ASTParticipantVisitor pt = new ASTParticipantVisitor();
        Set<String> participants = globalType.accept(pt);
        if (!participants.isEmpty()) {
            localTypesMap = new HashMap<>();
            for (String string : participants) {
                ProjectionVisitor projectionVisitor = new ProjectionVisitor(string);
                LocalType projectedType = globalType.accept(projectionVisitor);
                localTypesMap.put(string, projectedType);
            }
        }
    }

    

}
