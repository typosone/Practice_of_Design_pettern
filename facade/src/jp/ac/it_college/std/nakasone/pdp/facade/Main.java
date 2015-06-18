package jp.ac.it_college.std.nakasone.pdp.facade;

import jp.ac.it_college.std.nakasone.pdp.facade.pagemaker.PageMaker;

/**
 * Created by tsuyoshi on 2015/06/16.
 */
public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
    }
}
