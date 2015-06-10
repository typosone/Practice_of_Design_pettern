package jp.ac.it_college.std.nakasone.pdp.af.factory;

/**
 * Created by tsuyoshi on 2015/06/10.
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
