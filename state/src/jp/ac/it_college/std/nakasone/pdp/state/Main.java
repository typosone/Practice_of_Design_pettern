package jp.ac.it_college.std.nakasone.pdp.state;

/**
 * Created by tsuyoshi on 2015/06/17.
 */
public class Main {
    public static void main(String...args) {
        SafeFrame frame = new SafeFrame("State Sample");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // 何もしない
                }
            }
        }
    }
}
