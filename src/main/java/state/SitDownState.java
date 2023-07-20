package state;

public class SitDownState extends State {

    public SitDownState(Player player) {
        super(player);
    }

    @Override
    public void standUp() {
        player.setState(new StandUpState(player));
        player.talk("일어나 보자.");
    }

    @Override
    public void sitDown() {
        player.talk("계속 앉아 있을게.");
    }

    @Override
    public void walk() {
        player.setState(new StandUpState(player));
        player.talk("앉아 있었으니 일단 서야지.");
    }

    @Override
    public void run() {
        player.setState(new StandUpState(player));
        player.talk("앉아 있는데 뛰라고? 일단 일어날게.");
    }

    @Override
    public String getDiscription() {
        return "현재 앉아 있음";
    }
}
