package interpreter;

public class BeginExpression implements Expression {
    private CommandListExpression expression;

    @Override
    public boolean parse(Context context) {

        if (checkValidKeyword(context.getCurrentKeyword())) {
            context.readNextKeyword();
            expression = new CommandListExpression();
            return expression.parse(context);
        } else {
            return false;
        }
    }

    @Override
    public boolean run() {
        return expression.run();
    }

    public static boolean checkValidKeyword(String keyworld) {
        return keyworld.equals("BEGIN");
    }

    @Override
    public String toString() {
        return "BEGIN " + expression;
    }
}
