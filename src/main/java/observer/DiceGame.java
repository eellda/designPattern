package observer;

import java.util.LinkedList;

public abstract class DiceGame {
    // 자식 클래스도 접근 하능하게 하기 위한 protected
    protected LinkedList<Player> playerList = new LinkedList<Player>();

    public void add(Player player) {
        playerList.add(player);
    }

    public abstract void play();
}
