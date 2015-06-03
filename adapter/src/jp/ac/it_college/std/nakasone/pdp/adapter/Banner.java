package jp.ac.it_college.std.nakasone.pdp.adapter;

/**
 * Created by tsuyoshi on 2015/06/03.
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
