package state;

public class StandUpState extends  State {

    public StandUpState(Player player) {
        super(player);
    }

    @Override
    public void standUp() {
        player.talk("언제 움직일래?");
    }

    @Override
    public void sitDown() {
        player.setState(new SitDownState(player));
        player.talk("편하고 좋습니다.");

    }

    @Override
    public void walk() {
        player.setSpeed(5);
        player.setState(new WalkState(player));
        player.talk("걷는게 좋지요.");

    }

    @Override
    public void run() {
        player.setSpeed(10);
        player.setState(new RunState(player));
        player.talk("한번 뛰어 봅시다.");
    }

    @Override
    public String getDiscription() {
        return "제자리에 서 있음.";
    }
}
