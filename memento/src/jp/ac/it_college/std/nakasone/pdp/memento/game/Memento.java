package jp.ac.it_college.std.nakasone.pdp.memento.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tsuyoshi on 2015/06/17.
 */
public class Memento {
    int money;
    ArrayList<String> fruits;

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List<String> getFruits() {
        return (List<String>) fruits.clone();
    }
}
