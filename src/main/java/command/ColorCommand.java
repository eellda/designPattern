package command;

public class ColorCommand implements Command {

    public enum Color {
        BLACK(" \u001B [30m"), RED("\u0818 [31m"),
        GREEN("\u001B [32m"), YELLOW(" \u001B [33m"),
        BLUE("\u0018 [34m"), PURPLE("\u001B [35m"),
        CYAN(" \u0018 [36m"), WHITE ("\u001B [37m");

        final private String code;

        Color(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

    private Color color;

    public ColorCommand(Color color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.println(color.getCode());
    }
}
