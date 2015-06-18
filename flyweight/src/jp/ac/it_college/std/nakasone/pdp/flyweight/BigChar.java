package jp.ac.it_college.std.nakasone.pdp.flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by tsuyoshi on 2015/06/17.
 */
public class BigChar {
    private char charname;
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        try (
                BufferedReader reader = new BufferedReader(
                        new FileReader("data20/big" + charname + ".txt")
                );
        ) {
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line)
                        .append('\n');
            }
            this.fontdata = buf.toString();
        } catch (java.io.IOException e) {
            this.fontdata = charname + "?";
        }
    }

    public void print() {
        System.out.print(fontdata);
    }
}
