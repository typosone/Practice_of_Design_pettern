package jp.ac.it_college.std.nakasone.pdp.singleton;

/**
 * Created by tsuyoshi on 2015/06/04.
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("インスタンス生成しました");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
