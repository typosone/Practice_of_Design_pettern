package jp.ac.it_college.std.nakasone.pdp.af.listfactory;

import jp.ac.it_college.std.nakasone.pdp.af.factory.Item;
import jp.ac.it_college.std.nakasone.pdp.af.factory.Page;

/**
 * Created by tsuyoshi on 2015/06/10.
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>")
                .append(title)
                .append("</title></head>")
                .append('\n')
                .append("<body>")
                .append('\n')
                .append("<h1>")
                .append(title)
                .append("</h1>")
                .append('\n')
                .append("<ul>")
                .append('\n')
                ;
        for (Item item : content) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>")
                .append('\n')
                .append("<hr><address>")
                .append(author)
                .append("</address></body></html>")
                .append('\n')
                ;
        return buffer.toString();
    }
}
