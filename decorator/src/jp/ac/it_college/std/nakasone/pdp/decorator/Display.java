package jp.ac.it_college.std.nakasone.pdp.decorator;

/**
 * Created by tsuyoshi on 2015/06/11.
 */
public abstract class Display {
    public abstract int getColumns();

    public abstract int getRows();

    public abstract String getRowText(int row);

    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
