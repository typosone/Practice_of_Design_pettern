package jp.ac.it_college.std.nakasone.pdp.responsibility;

/**
 * Created by tsuyoshi on 2015/06/16.
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 == 1;
    }
}
