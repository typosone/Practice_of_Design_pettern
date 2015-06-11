package jp.ac.it_college.std.nakasone.pdp.decorator;

/**
 * Created by tsuyoshi on 2015/06/11.
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello, world.");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();
        Display d4 = new SideBorder(
                new FullBorder(
                        new SideBorder(
                                new FullBorder(
                                        new StringDisplay("こんにちは。")
                                ),
                                '*'
                        )
                ),
                '/'
        );
        d4.show();
    }
}
