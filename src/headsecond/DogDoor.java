package headsecond;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2017/6/27.
 */
public class DogDoor {
    private boolean open;
    private String allowedBark;

    public DogDoor() {
        this.open = false;
    }

    public void setAllowedBark(String bark) {
        allowedBark = bark;
    }

    public String getAllowedBark() {
        return allowedBark;
    }

    public void open() {
        System.out.println ("The dog door opens.");
        open = true;
        final Timer timer = new Timer ();
        timer.schedule (new TimerTask () {
            @Override
            public void run() {
                close ();
                timer.cancel ();
            }
        }, 5000);
    }

    public void close() {
        System.out.println ("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }
}
