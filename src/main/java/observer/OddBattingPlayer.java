package observer;

public class OddBattingPlayer extends Player {

    public OddBattingPlayer(String name) {
        super(name);
    }

    @Override
    public void update(int diceNo) {
        if (diceNo % 2 == 1) {
            System.out.println(getName() + "win!!");
        }
    }
}
