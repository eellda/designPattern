package factorymethod;

public class Sword implements Item {
    @Override
    public void use() {
        System.out.println("im sword!");
    }
}
