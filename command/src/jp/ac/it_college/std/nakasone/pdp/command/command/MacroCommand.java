package jp.ac.it_college.std.nakasone.pdp.command.command;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by tsuyoshi on 2015/06/18.
 */
public class MacroCommand implements Command {
    private Deque<Command> commands = new ArrayDeque<>();

    @Override
    public void execute() {
        for (Command cmd : commands) {
            cmd.execute();
        }
    }

    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
