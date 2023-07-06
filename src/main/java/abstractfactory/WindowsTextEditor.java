package abstractfactory;

public class WindowsTextEditor extends TextEditer {

    public WindowsTextEditor(String value) {
        super(value);
    }

    @Override
    public void render() {
        System.out.println("Windows Rendering API 를 이용해 " + this.value + "값을 가진 에디터를 그립니다.");
    }
}
