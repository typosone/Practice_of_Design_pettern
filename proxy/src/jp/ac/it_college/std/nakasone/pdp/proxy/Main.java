package jp.ac.it_college.std.nakasone.pdp.proxy;

/**
 * Created by tsuyoshi on 2015/06/18.
 */
public class Main {
    public static void main(String... args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("名前は現在" + p.getPrinterName()
                + "です。");
        p.setPrinterName("Bob");
        System.out.println("名前は現在" + p.getPrinterName()
                + "です。");
        p.print("Hello, world");
    }
}
