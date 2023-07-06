package observer;

public class EvenBattingPlayer extends Player {

    public EvenBattingPlayer(String name) {
        super(name);
    }

    @Override
    public void update(int diceNo) {
        if (diceNo % 2 == 0) {
            System.out.println(getName() + "win!!");
        }
    }
}
