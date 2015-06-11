package jp.ac.it_college.std.nakasone.pdp.bridge;

/**
 * Created by tsuyoshi on 2015/06/10.
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
