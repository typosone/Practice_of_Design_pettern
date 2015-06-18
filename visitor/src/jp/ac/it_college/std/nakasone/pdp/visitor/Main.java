package jp.ac.it_college.std.nakasone.pdp.visitor;

/**
 * Created by tsuyoshi on 2015/06/11.
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir)
                    .add(tmpdir)
                    .add(usrdir)
            ;
            bindir.add(new File("vi", 10000))
                    .add(new File("latex", 20000))
            ;
            rootdir.accept(new ListVisitor());

            System.out.println();
            System.out.println("Making user entries...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki)
                    .add(hanako)
                    .add(tomura)
            ;
            yuki.add(new File("diary.html", 100))
                    .add(new File("composite.java", 200))
            ;
            hanako.add(new File("memo.tex", 300));
            tomura.add(new File("game.doc", 400))
                    .add(new File("junk.mail", 500))
            ;
            rootdir.accept(new ListVisitor());
        } catch (FileTreatmentException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
            System.exit(-1);
        }
    }
}
