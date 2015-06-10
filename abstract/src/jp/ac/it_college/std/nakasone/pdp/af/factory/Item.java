package jp.ac.it_college.std.nakasone.pdp.af.factory;

/**
 * Created by tsuyoshi on 2015/06/10.
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
