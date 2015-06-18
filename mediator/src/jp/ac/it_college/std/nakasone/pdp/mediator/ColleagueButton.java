package jp.ac.it_college.std.nakasone.pdp.mediator;

import java.awt.*;

/**
 * Created by tsuyoshi on 2015/06/16.
 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
