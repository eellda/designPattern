package abstractfactory;

public class LinuxTextEditor extends TextEditer {

    public LinuxTextEditor(String value) {
        super(value);
    }

    @Override
    public void render() {
        System.out.println("Linux Rendering API 를 이용해 " + this.value + " 값을 가진 에디터를 그립니다.");
    }
}
