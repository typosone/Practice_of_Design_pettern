package jp.ac.it_college.std.nakasone.pdp.visitor;

/**
 * Created by tsuyoshi on 2015/06/11.
 */
public interface Element {
    void accept(Visitor v);
}
