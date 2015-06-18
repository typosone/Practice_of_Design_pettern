package jp.ac.it_college.std.nakasone.pdp.proxy;

/**
 * Created by tsuyoshi on 2015/06/18.
 */
public class PrinterProxy implements Printable {
    private String name;
    private Printer real;

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}
