package jp.ac.it_college.std.nakasone.pdp.state;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tsuyoshi on 2015/06/17.
 */
public class SafeFrame extends Frame implements ActionListener, Context {
    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);
    private Button buttonUse = new Button("金庫使用");
    private Button buttonAlarm = new Button("非常ベル");
    private Button buttonPhone = new Button("通常通話");
    private Button buttonExit = new Button("終了");

    private State state = DayState.getInstance();

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());

        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);

        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);

        add(panel, BorderLayout.SOUTH);

        pack();
        show();

        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUse) {
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println('?');
        }
    }

    @Override
    public void setClock(int hour) {
        String clockstring = "現在時刻は";
        if (hour < 10) {
            clockstring += "0" + hour + ":00";
        } else {
            clockstring += hour + ":00";
        }
        System.out.println(clockstring);
        textClock.setText(clockstring);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println(this.state + "から" + state + "へ状態が変化しました。");
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + '\n');
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("record ... " + msg + '\n');
    }
}
