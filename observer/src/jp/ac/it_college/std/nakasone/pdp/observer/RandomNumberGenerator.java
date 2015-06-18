package jp.ac.it_college.std.nakasone.pdp.observer;

import java.util.Random;

/**
 * Created by tsuyoshi on 2015/06/16.
 */
public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
        System.out.println("hoge");

    }
}
