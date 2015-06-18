package jp.ac.it_college.std.nakasone.pdp.flyweight;

/**
 * Created by tsuyoshi on 2015/06/17.
 */
public class Main {
    public static void main(String...args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        BigString bs = new BigString(args[0]);
        bs.print();
    }
}
