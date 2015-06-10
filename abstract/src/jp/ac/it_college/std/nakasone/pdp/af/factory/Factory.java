package jp.ac.it_college.std.nakasone.pdp.af.factory;

/**
 * Created by tsuyoshi on 2015/06/10.
 */
public abstract class Factory {
    public static Factory getFactory(Class cls) {
        Factory factory = null;
        try {
            factory = (Factory) cls.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
            System.exit(1);
        }
        return factory;
    }

    public static Factory getFactory(String name) {
        Factory factory = null;
        try {
            factory = getFactory(Class.forName(name));
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
            System.exit(1);
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
