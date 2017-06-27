package headsecond;

/**
 * Created by Administrator on 2017/6/27.
 */
public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor dogDoor = new DogDoor ();
        BarkRecognizer barkRecognizer = new BarkRecognizer (dogDoor);
        Remote remote = new Remote (dogDoor);

        System.out.println ("Fido starts barking...");
        barkRecognizer.recognize ("Woof");

        System.out.println ("Fido has gone outside...");
        System.out.println ("Fido's all done...");
        try {
            Thread.currentThread ().sleep (10000);
        } catch (InterruptedException e) {
        }
        System.out.println ("...but he's stuck outside!");

        System.out.println ("Fido starts barking...");
        barkRecognizer.recognize ("Woof");

        System.out.println ("Fido's back inside...");
    }
}
