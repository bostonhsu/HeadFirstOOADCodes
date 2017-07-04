package headsecond;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/6/27.
 */
public class BarkRecognizer {
    private DogDoor dogDoor;

    public BarkRecognizer(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void recognize(Bark bark) {
        System.out.println ("   BarkRecognizer: Heard a '" + bark + "'");
        ArrayList allowedBarks = dogDoor.getAllowedBarks ();
        for (Iterator iterator = allowedBarks.iterator (); iterator.hasNext ();) {
            Bark allowedBark = (Bark)iterator.next ();
            if (allowedBark.equals (bark)) {
                dogDoor.open ();
                return;
            }
        }
        System.out.println ("This dog is not allowed.");
    }
}
