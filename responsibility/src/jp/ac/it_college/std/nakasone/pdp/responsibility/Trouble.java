package jp.ac.it_college.std.nakasone.pdp.responsibility;

/**
 * Created by tsuyoshi on 2015/06/16.
 */
public class Trouble {
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "[Trouble " + number + "]";
    }
}
