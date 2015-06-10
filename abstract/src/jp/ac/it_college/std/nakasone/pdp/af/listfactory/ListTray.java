package jp.ac.it_college.std.nakasone.pdp.af.listfactory;

import jp.ac.it_college.std.nakasone.pdp.af.factory.Item;
import jp.ac.it_college.std.nakasone.pdp.af.factory.Tray;

/**
 * Created by tsuyoshi on 2015/06/10.
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>")
                .append('\n')
                .append(caption)
                .append('\n')
                .append("<ul>")
                .append('\n')
                ;
        for (Item item : tray) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>")
                .append('\n')
                .append("</li>")
                .append('\n')
                ;
        return buffer.toString();
    }
}
