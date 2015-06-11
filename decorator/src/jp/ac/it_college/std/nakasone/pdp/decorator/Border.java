package jp.ac.it_college.std.nakasone.pdp.decorator;

/**
 * Created by tsuyoshi on 2015/06/11.
 */
public abstract class Border extends Display {
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
