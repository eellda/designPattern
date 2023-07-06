package factorymethod;

import java.util.HashMap;

public class ItemFactory extends Factory {

    // 각 아이템에 대한 최대 생성 갯수와 현재 생성된 아이템의 갯수를 저장
    private class ItemData {
        int maxCount;
        int currentCount;
        ItemData(int maxCount) {
            this.maxCount = maxCount;
        }
    }

    // ItemData를 값으로 하는 해쉬맵을 이용해 레파지토리 필드를 생성
    private HashMap<String, ItemData> repository;

    public ItemFactory() {
        repository = new HashMap<String, ItemData>();
        repository.put("sword", new ItemData(3));
        repository.put("shield", new ItemData(2));
        repository.put("bow", new ItemData(1));

    }

    @Override
    public boolean isCreatable(String name) {
        ItemData itemData = repository.get(name);

        if (itemData == null) {
            System.out.println("unnown item data");
            return false;
        }

        if (itemData.currentCount >= itemData.maxCount) {
            System.out.println(name + "은 품절 아이템 입니다.");
            return false;
        }

        return true;
    }

    @Override
    public Item createItem(String name) {
        Item item = null;

        if (name == "sword") item = new Sword();
        if (name == "shield") item = new Shield();
        if (name == "bow") item = new Bow();

        return item;
    }

    @Override
    public void postprocessItem(String name) {
        ItemData itemData = repository.get(name);
        if (itemData != null) itemData .currentCount++;
    }
}
