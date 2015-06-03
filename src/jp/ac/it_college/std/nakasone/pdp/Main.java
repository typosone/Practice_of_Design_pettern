package jp.ac.it_college.std.nakasone.pdp;

import jp.ac.it_college.std.nakasone.pdp.adapter.Print;
import jp.ac.it_college.std.nakasone.pdp.adapter.Print2;
import jp.ac.it_college.std.nakasone.pdp.adapter.PrintBanner;
import jp.ac.it_college.std.nakasone.pdp.adapter.PrintBanner2;
import jp.ac.it_college.std.nakasone.pdp.iterator.Book;
import jp.ac.it_college.std.nakasone.pdp.iterator.BookShelf;
import jp.ac.it_college.std.nakasone.pdp.iterator.Iterator;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        hashMapTest();
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

    public static void adapterMain() {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }

    public static void adapterMain2() {
        Print2 p = new PrintBanner2("Hello");
        p.printWeak();
        p.printStrong();
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

