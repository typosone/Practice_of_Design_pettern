package jp.ac.it_college.std.nakasone.pdp.interpreter;

import java.util.ArrayList;

/**
 * &lt;command list> ::= &lt;command>* end
 */
public class CommandListNode extends Node {
    private ArrayList<Node> list = new ArrayList<>();

    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
