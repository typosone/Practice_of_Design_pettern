package jp.ac.it_college.std.nakasone.pdp;

import jp.ac.it_college.std.nakasone.pdp.adapter.Print;
import jp.ac.it_college.std.nakasone.pdp.adapter.Print2;
import jp.ac.it_college.std.nakasone.pdp.adapter.PrintBanner;
import jp.ac.it_college.std.nakasone.pdp.adapter.PrintBanner2;
import jp.ac.it_college.std.nakasone.pdp.af.factory.Factory;
import jp.ac.it_college.std.nakasone.pdp.af.factory.Link;
import jp.ac.it_college.std.nakasone.pdp.af.factory.Page;
import jp.ac.it_college.std.nakasone.pdp.af.factory.Tray;
import jp.ac.it_college.std.nakasone.pdp.af.listfactory.ListFactory;
import jp.ac.it_college.std.nakasone.pdp.builder.Director;
import jp.ac.it_college.std.nakasone.pdp.builder.HTMLBuilder;
import jp.ac.it_college.std.nakasone.pdp.builder.TextBuilder;
import jp.ac.it_college.std.nakasone.pdp.factory.framework.Product;
import jp.ac.it_college.std.nakasone.pdp.factory.idcard.IDCardFactory;
import jp.ac.it_college.std.nakasone.pdp.iterator.Book;
import jp.ac.it_college.std.nakasone.pdp.iterator.BookShelf;
import jp.ac.it_college.std.nakasone.pdp.iterator.BookShelf2;
import jp.ac.it_college.std.nakasone.pdp.iterator.Iterator;
import jp.ac.it_college.std.nakasone.pdp.prototype.MessageBox;
import jp.ac.it_college.std.nakasone.pdp.prototype.UnderlinePen;
import jp.ac.it_college.std.nakasone.pdp.prototype.framework.Manager;
import jp.ac.it_college.std.nakasone.pdp.singleton.Singleton;
import jp.ac.it_college.std.nakasone.pdp.template.AbstractDisplay;
import jp.ac.it_college.std.nakasone.pdp.template.CharDisplay;
import jp.ac.it_college.std.nakasone.pdp.template.StringDisplay;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        abstractMain(new String[]{"list"});
    }

    private static void abstractMain(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main list");
            System.out.println("Example 2: java Main table");
            System.exit(0);
        }

        Factory factory = null;
        switch (args[0]) {
            case "list":
                factory = Factory.getFactory(ListFactory.class);
                break;
            case "table":
                factory = Factory.getFactory(ListFactory.class);
                break;
            default:
                factory = Factory.getFactory(ListFactory.class);
                break;
        }



        Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
        Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo! Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("新聞");
        traynews.add(asahi);
        traynews.add(yomiuri);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch = factory.createTray("サーチエンジン");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "結城 浩");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }

    private static void builderMain(String[] args) {
        if (args.length != 1) {
            builderUsage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getResult();
            System.out.println(filename + " が作成されました。");
        } else {
            builderUsage();
            System.exit(0);
        }
    }

    private static void builderUsage() {
        System.out.println("Usage: java Main plain\t\tプレーンテキストで文書作成");
        System.out.println("Usage: java Main html\t\tHTMLファイルで文書作成");
    }

    public static void prototypeMain() {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        jp.ac.it_college.std.nakasone.pdp.prototype.framework.Product p1
                = manager.create("strong message");
        p1.use("Hello, world.");

        jp.ac.it_college.std.nakasone.pdp.prototype.framework.Product p2
                = manager.create("warning box");
        p2.use("Hello, world.");

        jp.ac.it_college.std.nakasone.pdp.prototype.framework.Product p3
                = manager.create("slash box");
        p3.use("Hello, world.");
    }

    public static void factoryMain() {
        jp.ac.it_college.std.nakasone.pdp.factory.framework.Factory
                factory = new IDCardFactory();

        Product card1 = factory.create("結城浩");
        Product card2 = factory.create("とむら");
        Product card3 = factory.create("佐藤花子");

        card1.use();
        card2.use();
        card3.use();
    }

    public static void singletonMain() {
        System.out.println("Start");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1とobj2は同じインスタンスです");
        } else {
            System.out.println("obj1とobj2は同じインスタンスではありません");
        }
        System.out.println("End.");
    }

    public static void templateMain() {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d3 = new StringDisplay("こんにちは。");

        d1.display();
        d2.display();
        d3.display();
    }

    public static void adapterMain2() {
        Print2 p = new PrintBanner2("Hello");
        p.printWeak();
        p.printStrong();
    }

    public static void adapterMain() {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }

    public static void iteratorMain() {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }

    public static void practice1_1() {
        BookShelf2 bookShelf = new BookShelf2(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }

    public static void arrayListTest1() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");

        list.add("Diana");
        list.add("Elmo");

        for (String name : list) {
            System.out.println(name);
        }
    }

    public static void arrayListTest2() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add("Diana");
        list.add("Elmo");

        System.out.println("削除のまえ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }
        System.out.println();

        list.remove("Alice");
        list.remove("Bob");
        list.remove("Elmo");

        System.out.println("削除のあと");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }
        System.out.println();

        if (list.contains("Alice")) {
            System.out.println("listにAliceは含まれています。");
        } else {
            System.out.println("listにAliceは含まれていません。");
        }

    }

    public static void listTest() {
        List<String> list = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add("Bob");
        list.add("Elmo");

        System.out.println("最初の要素 = " + list.get(0));
        System.out.println("最後の要素 = " + list.get(list.size() - 1));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("最初に出てくるBobの添字 = " +
                list.indexOf("Bob"));
        System.out.println("最後に出てくるBobの添字 = " +
                list.lastIndexOf("Bob"));
    }

    public static void linkedListTest() {
        LinkedList<String> list = new LinkedList<>();

        list.add("Bob");
        list.add("Chris");
        list.add("Diana");
        list.add("Elmo");

        System.out.println(list);

        list.addFirst("Alice");

        System.out.println(list);
    }

    public static void queueTest1() {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Alice");
        System.out.println("offer後のqueue = " + queue);

        queue.offer("Bob");
        System.out.println("offer後のqueue = " + queue);

        queue.offer("Chris");
        System.out.println("offer後のqueue = " + queue);

        queue.offer("Diana");
        System.out.println("offer後のqueue = " + queue);

        while (queue.peek() != null) {
            String name = queue.poll();
            System.out.println("pollの戻り値    = " + name);
            System.out.println("poll後のqueue  = " + queue);
        }
    }

    public static void queueTest2() {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Alice");
        System.out.println("offer後のqueue = " + queue);

        queue.offer("Bob");
        System.out.println("offer後のqueue = " + queue);

        queue.offer("Chris");
        System.out.println("offer後のqueue = " + queue);

        queue.offer("Diana");
        System.out.println("offer後のqueue = " + queue);

        while (true) {
            String name = queue.element();
            System.out.println("elementの戻り値   = " + name);

            name = queue.remove();
            System.out.println("removeの戻り値    = " + name);
            System.out.println("remove後のqueue  = " + queue);
        }
    }

    public static void stackTest() {
        Deque<String> stack = new LinkedList<>();

        stack.addFirst("Alice");
        System.out.println("addFirst 後の stack = " + stack);

        stack.addFirst("Bob");
        System.out.println("addFirst 後の stack = " + stack);

        stack.addFirst("Chris");
        System.out.println("addFirst 後の stack = " + stack);

        stack.addFirst("Diana");
        System.out.println("addFirst 後の stack = " + stack);

        stack.addFirst("Elmo");
        System.out.println("addFirst 後の stack = " + stack);

        while (true) {
            String name = stack.getFirst();
            System.out.println("getFirst の戻り値 = " + name);

            name = stack.removeFirst();
            System.out.println("removeFirst の戻り値    = " + name);
            System.out.println("removeFirst 後の stack = " + stack);
        }
    }

    public static void hashSetTest() {
        Set<String> set = new HashSet<>();

        set.add("Alice");
        set.add("Bob");
        set.add("Chris");
        set.add("Diana");
        set.add("Elmo");
        set.add("Diana");
        set.add("Alice");

        for (String name : set) {
            System.out.println(name);
        }

        if (set.contains("Alice")) {
            System.out.println("Alice は含まれています。");
        } else {
            System.out.println("Alice は含まれていません。");
        }
    }

    public static void hashMapTest() {
        Map<String, Integer> map = new HashMap<>();

        map.put("Alice", 100);
        map.put("Bob", 57);
        map.put("Chris", 85);
        map.put("Diana", 85);
        map.put("Elmo", 92);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println();

        for (String name : map.keySet()) {
            System.out.println(name);
        }
        System.out.println();

        for (int value : map.values()) {
            System.out.println(value);
        }
        System.out.println();

        for (String name : map.keySet()) {
            System.out.println(name + " => " + map.get(name));
        }
        System.out.println();

        System.out.println("Fred の値 = " + map.get("Fred"));
    }

    public void dummy() {
    }
}

