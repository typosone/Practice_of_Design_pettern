package jp.ac.it_college.std.nakasone.pdp.interpreter;

/**
 * Created by tsuyoshi on 2015/06/18.
 */
public abstract class Node {
    public abstract void parse(Context contect) throws ParseException;
}
