package jp.ac.it_college.std.nakasone.pdp.flyweight;

import java.util.HashMap;

/**
 * Created by tsuyoshi on 2015/06/17.
 */
public class BigCharFactory {
    private HashMap<Character, BigChar> pool = new HashMap<>();
    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charname) {

        BigChar bc = pool.get(charname);
        if (bc == null) {
            bc = new BigChar(charname);
            pool.put(charname, bc);
        }

        return bc;
    }
}
