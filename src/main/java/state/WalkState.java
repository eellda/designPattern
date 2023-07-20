package state;

public class WalkState extends State {

    public WalkState(Player player) {
        super(player);
    }

    @Override
    public void standUp() {
        player.setSpeed(0);
        player.setState(new StandUpState(player));
        player.talk("멈출게.");
    }

    @Override
    public void sitDown() {
        player.setSpeed(0);
        player.setState(new StandUpState(player));
        player.talk("걷다가 앉으라 하면 지쳐요.");
    }

    @Override
    public void walk() {
        player.talk("계속 걸을게요.");
    }

    @Override
    public void run() {
        player.setSpeed(20);
        player.setState(new RunState(player));
        player.talk("스퍼트좀 내볼까.");
    }

    @Override
    public String getDiscription() {
        return "걷는중~";
    }
}
