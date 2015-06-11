package jp.ac.it_college.std.nakasone.pdp.strategy;

/**
 * Created by tsuyoshi on 2015/06/10.
 */
public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
