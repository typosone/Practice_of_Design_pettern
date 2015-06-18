package jp.ac.it_college.std.nakasone.pdp.proxy;

/**
 * Created by tsuyoshi on 2015/06/18.
 */
public interface Printable {
    void setPrinterName(String name);
    String getPrinterName();
    void print(String string);
}
