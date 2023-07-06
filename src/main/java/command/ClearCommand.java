package command;

public class ClearCommand implements Command {

    @Override
    public void run() {
        System.out.println("\033\143");
        System.out.flush();
    }
}
