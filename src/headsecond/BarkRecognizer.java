package headsecond;

/**
 * Created by Administrator on 2017/6/27.
 */
public class BarkRecognizer {
    private DogDoor dogDoor;

    public BarkRecognizer(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void recognize(String bark) {
        System.out.println ("   BarkRecognizer: Heard a '" + bark + "'");
        if (dogDoor.getAllowedBarkString ().equalsIgnoreCase (bark)) {
            dogDoor.open ();
        } else {
            System.out.println ("This dog is not allowed.");
        }
    }
}
