package headsecond;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2017/6/27.
 */
public class DogDoor {
    private boolean open;
    private Bark allowedBark;
    private ArrayList<Bark> allowedBarks;

    public ArrayList<Bark> getAllowedBarks() {
        return allowedBarks;
    }

    public void setAllowedBark(Bark allowedBark) {
        this.allowedBark = allowedBark;
    }

    public Bark getAllowedBark() {
        return allowedBark;
    }

    public DogDoor() {
        this.open = false;
        allowedBarks = new ArrayList<Bark> ();
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

    public void addAllowedBark(Bark rowlf) {
        allowedBarks.add (rowlf);
    }
}
