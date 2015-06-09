package jp.ac.it_college.std.nakasone.pdp.prototype.framework;

import java.util.HashMap;

/**
 * Created by tsuyoshi on 2015/06/04.
 */
public class Manager {
    private HashMap showcase = new HashMap();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}
