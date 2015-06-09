package jp.ac.it_college.std.nakasone.pdp.factory.idcard;

import jp.ac.it_college.std.nakasone.pdp.factory.framework.Product;

/**
 * Created by tsuyoshi on 2015/06/04.
 */
public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "のカードを作ります");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "のカードを使います");
    }

    public String getOwner() {
        return owner;
    }
}
