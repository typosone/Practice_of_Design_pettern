package jp.ac.it_college.std.nakasone.pdp.af.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * Created by tsuyoshi on 2015/06/10.
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + "を作成しました");
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
            System.exit(1);
        }
    }

    public abstract String makeHTML();
}
