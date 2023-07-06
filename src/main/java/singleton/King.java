package singleton;

public class King {

    // 클래스의 이름으로 접근하기 위해 static
    private static King self = null;

    private King() {

    }

    // 클래스 차원에서 self 라는 필드를 얻기 위함
    // 멀티쓰레드에서 머소드를 호출할 때 문제가 없게 동기하 하기 위해 synchronized 사용
    public synchronized static King getInstance() {

        if (self == null) {
            self = new King();
        }

        // getInstance() 메소드가 호출 되지 않으면 self 라는 객체는 생성되지 않음
        return self;
    }

    public void print() {
        System.out.println("나는 오직 한개뿐");
    }
}
