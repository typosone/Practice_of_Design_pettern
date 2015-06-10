package jp.ac.it_college.std.nakasone.pdp.af.listfactory;

import jp.ac.it_college.std.nakasone.pdp.af.factory.Factory;
import jp.ac.it_college.std.nakasone.pdp.af.factory.Link;
import jp.ac.it_college.std.nakasone.pdp.af.factory.Page;
import jp.ac.it_college.std.nakasone.pdp.af.factory.Tray;

/**
 * Created by tsuyoshi on 2015/06/10.
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
