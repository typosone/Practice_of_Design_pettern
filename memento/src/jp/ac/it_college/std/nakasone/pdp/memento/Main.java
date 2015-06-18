package jp.ac.it_college.std.nakasone.pdp.memento;

import jp.ac.it_college.std.nakasone.pdp.memento.game.Gamer;
import jp.ac.it_college.std.nakasone.pdp.memento.game.Memento;

/**
 * Created by tsuyoshi on 2015/06/17.
 */
public class Main {
    public static void main(String...args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("現状: " + gamer);

            gamer.bet();

            System.out.println("所持金は" + gamer.getMoney() + "円になりました。");

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    (だいぶ増えたので、現在の状態を保存しておこう) ");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    (だいぶ減ったので、以前の状態に復帰しよう)");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // 何もしない
            }
            System.out.println();
        }
    }
}
