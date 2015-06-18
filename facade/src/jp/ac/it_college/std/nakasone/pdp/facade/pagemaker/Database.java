package jp.ac.it_college.std.nakasone.pdp.facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by tsuyoshi on 2015/06/16.
 */
public class Database {
    private Database() {
    }

    public static Properties getProperties(String dbname) {
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.err.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}
