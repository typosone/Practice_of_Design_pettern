package jp.ac.it_college.std.nakasone.pdp.responsibility;

/**
 * Created by tsuyoshi on 2015/06/16.
 */
public class SpecialSupport extends Support {
    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == number;
    }
}
