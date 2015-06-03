package jp.ac.it_college.std.nakasone.pdp.adapter;

/**
 * Created by tsuyoshi on 2015/06/03.
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
