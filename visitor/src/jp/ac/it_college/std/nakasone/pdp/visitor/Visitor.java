package jp.ac.it_college.std.nakasone.pdp.visitor;

/**
 * Created by tsuyoshi on 2015/06/11.
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
