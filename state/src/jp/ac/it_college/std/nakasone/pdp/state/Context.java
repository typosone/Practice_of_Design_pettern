package jp.ac.it_college.std.nakasone.pdp.state;

/**
 * Created by tsuyoshi on 2015/06/17.
 */
public interface Context {
    void setClock(int hour);
    void changeState(State state);
    void callSecurityCenter(String msg);
    void recordLog(String msg);
}
