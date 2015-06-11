package jp.ac.it_college.std.nakasone.pdp.bridge;

import java.io.UnsupportedEncodingException;

/**
 * Created by tsuyoshi on 2015/06/10.
 */
public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        try {
            this.width = string.getBytes("MS932").length;
        } catch (UnsupportedEncodingException e) {
            System.err.println(e.getMessage());
            this.width = string.getBytes().length;
        }
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i< width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
