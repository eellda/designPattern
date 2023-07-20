package state;

public class RunState extends State {

    public RunState(Player player) {
        super(player);
    }

    @Override
    public void standUp() {
        player.setSpeed(0);
        player.setState(new StandUpState(player));
        player.talk("뛰다가 멈추면 숨쉬기가...");
    }

    @Override
    public void sitDown() {
        player.setSpeed(0);
        player.setState(new StandUpState(player));
        player.talk("뛰다가는 못앉지.");
    }

    @Override
    public void walk() {
        player.setSpeed(8);
        player.setState(new WalkState(player));
        player.talk("걷는게 좋지요.");
    }

    @Override
    public void run() {
        player.setSpeed(player.getSpeed() + 4);
        player.talk("더 빨리 뛰라고?");
    }

    @Override
    public String getDiscription() {
        return "뛰는중";
    }
}
