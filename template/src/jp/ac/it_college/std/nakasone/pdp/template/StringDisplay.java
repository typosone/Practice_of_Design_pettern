package jp.ac.it_college.std.nakasone.pdp.template;

import java.io.UnsupportedEncodingException;

/**
 * Created by tsuyoshi on 2015/06/04.
 */
public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        try {
            this.width = string.getBytes("MS932").length;
        } catch (UnsupportedEncodingException e) {
            System.err.println("未対応の文字コードらしいです");
            System.exit(1);
        }
        System.out.println("width: " + width);
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
