package jp.ac.it_college.std.nakasone.pdp.observer;

/**
 * Created by tsuyoshi on 2015/06/16.
 */
public class Main {
    public static void main(String...args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
