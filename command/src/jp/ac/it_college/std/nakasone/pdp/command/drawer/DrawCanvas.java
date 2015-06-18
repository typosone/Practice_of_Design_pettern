package jp.ac.it_college.std.nakasone.pdp.command.drawer;

import jp.ac.it_college.std.nakasone.pdp.command.command.MacroCommand;

import java.awt.*;

/**
 * Created by tsuyoshi on 2015/06/18.
 */
public class DrawCanvas extends Canvas implements Drawable {
    private Color color = Color.red;
    private int radius = 6;
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    public void paint(Graphics g) {
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
