package jp.ac.it_college.std.nakasone.pdp.state;

/**
 * Created by tsuyoshi on 2015/06/17.
 */
public class NightState implements State {
    private static NightState singleton = new NightState();

    private NightState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("非常:夜間の金庫使用!");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("非常ベル(夜間)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("夜間の通話記録");
    }

    public String toString() {
        return "[夜間]";
    }
}
