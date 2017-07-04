package headsecond;

/**
 * Created by Administrator on 2017/6/27.
 */
public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor dogDoor = new DogDoor ();
        dogDoor.addAllowedBark(new Bark("rowlf"));
        dogDoor.addAllowedBark(new Bark("rooowlf"));
        dogDoor.addAllowedBark(new Bark("rawlf"));
        dogDoor.addAllowedBark(new Bark("woof"));

        BarkRecognizer barkRecognizer = new BarkRecognizer (dogDoor);

        Remote remote = new Remote (dogDoor);

        System.out.println ("Bruce starts barking.");
        barkRecognizer.recognize (new Bark ("rowlf"));

        System.out.println ("Bruce has gone outside...");

        try {
            Thread.currentThread ().sleep(10000);
        } catch (InterruptedException e){
        }

        System.out.println ("Bruce's all done...");
        System.out.println ("...but he's stuck outside!");

        Bark smallDogBark = new Bark("yip");
        System.out.println ("A small dog starts barking...");
        barkRecognizer.recognize (smallDogBark);

        try {
            Thread.currentThread ().sleep(5000);
        } catch (InterruptedException e) { }

        System.out.println ("Bruce starts barking.");
        barkRecognizer.recognize (new Bark ("rooowlf"));

        System.out.println ("Bruce's back inside...");
    }
}
