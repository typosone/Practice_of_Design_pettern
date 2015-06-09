package jp.ac.it_college.std.nakasone.pdp.factory.framework;

/**
 * Created by tsuyoshi on 2015/06/04.
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
