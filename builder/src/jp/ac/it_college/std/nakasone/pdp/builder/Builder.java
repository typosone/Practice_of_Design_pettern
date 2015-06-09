package jp.ac.it_college.std.nakasone.pdp.builder;

/**
 * Created by tsuyoshi on 2015/06/09.
 */
public abstract class Builder {
    public abstract Builder makeTitle(String title);
    public abstract Builder makeString(String str);
    public abstract Builder makeItems(String[] items);
    public abstract void close();
}

