package composite;

// 자식 클래스에서 구현해야 하는 메소드가 필요하므로 abstract 선언
public abstract class Unit {
    private String name;

    public Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                '}';
    }

    // 사이즈는 파일과 폴더 각각 되기 때문에 추상으로 선언
    public abstract int getSize();
}
