package jp.ac.it_college.std.nakasone.pdp.interpreter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by tsuyoshi on 2015/06/18.
 */
public class Main {
    public static void main(String... args) {
        try (
            BufferedReader reader = new BufferedReader(
                    new FileReader("data23/program.txt"));
        ) {
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (IOException | ParseException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
        }
    }
}
