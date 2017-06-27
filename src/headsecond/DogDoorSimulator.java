package headsecond;

/**
 * Created by Administrator on 2017/6/27.
 */
public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor dogDoor = new DogDoor ();
        Remote remote = new Remote (dogDoor);
        System.out.println ("Fido barks to go outsides...");
        remote.pressButton ();
        System.out.println ("Fido has gone outside...");
        //remote.pressButton ();
        System.out.println ("Fido's all done...");
        //remote.pressButton ();
        try {
            Thread.currentThread ().sleep (10000);
        } catch (InterruptedException e) {
        }
        System.out.println ("...but he's stuck outside!");
        System.out.println ("Fido starts barking...");
        System.out.println ("...so Gina grabs the remote control.");
        remote.pressButton ();
        System.out.println ("Fido's back inside...");
        //remote.pressButton ();
    }
}
