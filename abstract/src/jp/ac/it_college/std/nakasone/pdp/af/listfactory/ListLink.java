package jp.ac.it_college.std.nakasone.pdp.af.listfactory;

import jp.ac.it_college.std.nakasone.pdp.af.factory.Link;

/**
 * Created by tsuyoshi on 2015/06/10.
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
