package headfirst;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/6/23.
 */
public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory ();
        initializeInventory (inventory);

        GuitarSpec whatErinLikes = new GuitarSpec (Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER, "Stratocastor");
        List matchingGuitars = inventory.search (whatErinLikes);
        if (!matchingGuitars.isEmpty ()) {
            System.out.println ("Erin, you might like these guitars:");
            for (Iterator iterator = matchingGuitars.iterator (); iterator.hasNext ();) {
                Guitar guitar = (Guitar)iterator.next ();
                GuitarSpec spec = guitar.getSpec ();
                System.out.println ("We have a " +
                        spec.getBuilder () + " " + spec.getModel () + " " +
                        spec.getType () + " guitar:\n" +
                        spec.getBackWood () + " back and sides,\n" +
                        spec.getTopWood () + " top.\nYou can have it for only $" +
                        guitar.getPrice () + "!");
            }

        } else {
            System.out.println ("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar ("V95693", 1499.95, new GuitarSpec (Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER,"Stratocastor"));
        inventory.addGuitar ("V9512", 1549.95, new GuitarSpec (Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER,"Stratocastor"));
    }
}
