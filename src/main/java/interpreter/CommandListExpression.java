package interpreter;

import java.util.ArrayList;
import java.util.Iterator;

public class CommandListExpression implements Expression {
    private ArrayList<CommandExpression> commands = new ArrayList<CommandExpression>();

    @Override
    public boolean parse(Context context) {

        while (true) {
            String currnetKeyword = context.getCurrentKeyword();

            if (currnetKeyword == null) {
                return false;
            } else if (currnetKeyword.equals("END")) {
                context.readNextKeyword();
                break;
            } else {
                CommandExpression command = null;

                if (LoopCommandExpression.checkValidKeyword(currnetKeyword)) {
                    command = new LoopCommandExpression(currnetKeyword);
                } else if (ActionCommandExpression.checkValidKeyword(currnetKeyword)) {
                    command = new ActionCommandExpression(currnetKeyword);
                }

                if (command != null) {
                    if (command.parse(context)) {
                        commands.add(command);
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean run() {
        Iterator<CommandExpression> iter = commands.iterator();

        while (iter.hasNext()) {
            boolean bOk = iter.next().run();

            if (!bOk) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return commands.toString();
    }
}
