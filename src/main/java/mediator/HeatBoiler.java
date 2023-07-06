package mediator;

public class HeatBoiler extends Participant {
    private boolean bOff = true;

    public HeatBoiler(Mediator mediator) {
        super(mediator);
        this.bOff = bOff;
    }

    public void on() {
        if (!bOff) {
            return;
        }

        bOff = false;

        mediator.participantChange(this);
    }

    public void off() {
        if (bOff) {
            return;
        }

        bOff = true;
        mediator.participantChange(this);
    }

    public boolean isRunning() {
        return !bOff;
    }

    @Override
    public String toString() {
        if (bOff) {
            return "보일러: 꺼짐";
        } else {
            return "보일러: 켜짐";
        }

    }
}
