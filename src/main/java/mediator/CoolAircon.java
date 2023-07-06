package mediator;

public class CoolAircon extends Participant {

    private boolean bOff = true;

    public CoolAircon(Mediator mediator) {
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
            return "에어컨: 꺼짐";
        } else {
            return "에어컨: 켜짐";
        }

    }
}
