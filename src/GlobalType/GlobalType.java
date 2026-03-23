package GlobalType;

import ProjectionAlgorithm.Visitor;

public abstract class GlobalType implements Visitable{

    @Override
    public abstract <T> T accept(Visitor<T> visitor);
    
}
