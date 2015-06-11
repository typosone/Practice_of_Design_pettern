package jp.ac.it_college.std.nakasone.pdp.decorator;

import java.io.UnsupportedEncodingException;

/**
 * Created by tsuyoshi on 2015/06/11.
 */
public class StringDisplay extends Display {
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        try {
            return string.getBytes("MS932").length;
        } catch (UnsupportedEncodingException e) {
            return string.getBytes().length;
        }
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
