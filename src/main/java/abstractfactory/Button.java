package abstractfactory;

public abstract class Button {
    protected String caption;

    public Button(String caption) {
        this.caption = caption;
    }

    public void clickEvent() {
        System.out.println(caption + " 버튼을 클릭 했습니다.");
    }

    public abstract void render();
}
