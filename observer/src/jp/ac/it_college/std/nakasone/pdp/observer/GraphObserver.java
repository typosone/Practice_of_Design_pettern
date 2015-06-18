package jp.ac.it_college.std.nakasone.pdp.observer;

/**
 * Created by tsuyoshi on 2015/06/16.
 */
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver: ");
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print('*');
        }
        System.out.println();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // 何もしない
        }
    }
}
