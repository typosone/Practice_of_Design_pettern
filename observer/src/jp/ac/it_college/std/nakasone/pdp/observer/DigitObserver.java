package jp.ac.it_college.std.nakasone.pdp.observer;

/**
 * Created by tsuyoshi on 2015/06/16.
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver: " + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // 何もしない
        }
    }
}
