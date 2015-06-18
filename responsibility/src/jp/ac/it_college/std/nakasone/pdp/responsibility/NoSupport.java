package jp.ac.it_college.std.nakasone.pdp.responsibility;

/**
 * Created by tsuyoshi on 2015/06/16.
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
