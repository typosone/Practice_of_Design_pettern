package jp.ac.it_college.std.nakasone.pdp.memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by tsuyoshi on 2015/06/17.
 */
public class Gamer {
    private static String[] fruitsname = {
            "リンゴ", "ぶどう", "バナナ", "みかん",
    };
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("所持金が増えました。");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("所持金が半分になりました。");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("フルーツ(" + f + ")をもらいました。");
            fruits.add(f);
        } else {
            System.out.println("何も起こりませんでした。");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        for (String f : fruits) {
            m.addFruit(f);
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "おいしい";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }
}
