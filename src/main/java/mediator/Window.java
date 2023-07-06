package mediator;

public class Window extends Participant {
    private boolean bClosed = true;

    public Window(Mediator mediator) {
        super(mediator);
        this.bClosed = bClosed;
    }

    public void open() {
        if (!bClosed) {
            return;
        }

        bClosed = false;

        mediator.participantChange(this);
    }

    public void close() {
        if (bClosed) {
            return;
        }

        bClosed = true;
        mediator.participantChange(this);
    }

    public boolean isbClosed() {
        return bClosed;
    }

    @Override
    public String toString() {
        if (bClosed) {
            return "창: 닫힘";
        } else {
            return "창: 열림";
        }
    }
}
