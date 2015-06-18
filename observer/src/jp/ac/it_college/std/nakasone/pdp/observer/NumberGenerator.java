package jp.ac.it_college.std.nakasone.pdp.observer;

import java.util.ArrayList;

/**
 * Created by tsuyoshi on 2015/06/16.
 */
public abstract class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();
}
