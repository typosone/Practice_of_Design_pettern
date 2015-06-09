package jp.ac.it_college.std.nakasone.pdp.prototype.framework;

/**
 * Created by tsuyoshi on 2015/06/04.
 */
public interface Product extends Cloneable {
    void use(String s);
    Product createClone();
}
