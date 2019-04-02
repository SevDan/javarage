package mp.rage.api.event;

import javax.swing.*;
import java.util.List;

public abstract class AbstractEvent {
    private boolean interruptible;
    private boolean interrupted = false;

    public AbstractEvent() {
        interruptible = true;
    }

    public AbstractEvent(boolean interruptible) {
        this.interruptible = interruptible;
    }

    public void interrupt() {
        if(interruptible) {
            interrupted = true;
        } else {

        }
    }

    public boolean isInterrupted() {
        return interrupted;
    }
}
