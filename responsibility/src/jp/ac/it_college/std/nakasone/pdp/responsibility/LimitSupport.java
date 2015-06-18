package jp.ac.it_college.std.nakasone.pdp.responsibility;

/**
 * Created by tsuyoshi on 2015/06/16.
 */
public class LimitSupport extends Support {
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}
