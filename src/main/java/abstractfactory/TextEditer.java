package abstractfactory;

public abstract class TextEditer {
    protected String value;

    public TextEditer(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
        render();
    }

    public abstract void render();
}
