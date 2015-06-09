package jp.ac.it_college.std.nakasone.pdp.prototype;

import jp.ac.it_college.std.nakasone.pdp.prototype.framework.Product;

import java.io.UnsupportedEncodingException;

/**
 * Created by tsuyoshi on 2015/06/04.
 */
public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = 0;
        try {
            length = s.getBytes("MS932").length;
        } catch (UnsupportedEncodingException e) {
            System.err.println("サポートされない文字コードです");
            System.exit(1);
        }
        for (int i = 0; i < length; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("cloneがサポートされていないクラスです");
            System.err.println(e.getStackTrace());
        }
        return p;
    }
}
