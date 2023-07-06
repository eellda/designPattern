package factorymethod;

public abstract class Factory {

    public abstract boolean isCreatable(String name);
    public abstract Item createItem(String name);
    public abstract void postprocessItem(String name);

    public Item create(String name) {
        // 생성이 가능한지 확인
        boolean bCreatable = this.isCreatable(name);

        if (bCreatable) {
            // 객체 생성
            Item item = this.createItem(name);
            // 후처리
            postprocessItem(name);
            return item;
        }

        return null;
    }
}
