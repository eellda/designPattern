package composite;

import java.util.Iterator;
import java.util.LinkedList;

public class Folder extends Unit {
    private LinkedList<Unit> unitList = new LinkedList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Unit> iterator = unitList.iterator();

        while (iterator.hasNext()) {
            Unit unit = iterator.next();
            size += unit.getSize();
        }
        return size;
    }

    // unit 객체를 추가시켜 포함시킬 수 있음
    public boolean add(Unit unit) {
        unitList.add(unit);
        return true;
    }

    // 자신이 포함하고 있는 요소를 목록으로 출력해줌

    private void list(String indent, Unit unit) {

        if (unit instanceof File) {
            System.out.println(indent + unit);
        } else {
            Folder dir = (Folder)unit;
            Iterator<Unit> iterator = dir.unitList.iterator();
            System.out.println(indent + "+" + unit);

            while (iterator.hasNext()) {
                // 자기 자신을 호출하는 재귀
                list(indent + "    ", iterator.next());
            }
        }
    }

    public void list() {
        list("", this);
    }
}
