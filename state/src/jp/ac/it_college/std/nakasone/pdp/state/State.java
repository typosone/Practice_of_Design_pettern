package jp.ac.it_college.std.nakasone.pdp.state;

/**
 * Created by tsuyoshi on 2015/06/17.
 */
public interface State {
    void doClock(Context context, int hour);
    void doUse(Context context);
    void doAlarm(Context context);
    void doPhone(Context context);
}
