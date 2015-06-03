package jp.ac.it_college.std.nakasone.pdp.adapter;

/**
 * Created by tsuyoshi on 2015/06/03.
 */
public class PrintBanner2 extends Print2 {
    private Banner banner;

    public PrintBanner2(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
