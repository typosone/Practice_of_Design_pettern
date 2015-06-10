package jp.ac.it_college.std.nakasone.pdp.af.factory;

import java.util.ArrayList;

/**
 * Created by tsuyoshi on 2015/06/10.
 */
public abstract class Tray extends Item {
    protected ArrayList<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
