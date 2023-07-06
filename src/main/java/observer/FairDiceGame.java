package observer;

import java.util.Iterator;
import java.util.Random;

public class FairDiceGame extends DiceGame {
    private Random random = new Random();

    @Override
    public void play() {
        int diceNum = random.nextInt(6) + 1;
        System.out.println("던진 주사위는 : " + diceNum);

        Iterator<Player> iter = playerList.iterator();

        while (iter.hasNext()) {
            iter.next().update(diceNum);
        }
    }
}
