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

        Guitar whatErinLikes = new Guitar ("", Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 0);
        List matchingGuitars = inventory.search (whatErinLikes);
        if (!matchingGuitars.isEmpty ()) {
            System.out.println ("Erin, you might like these guitars:");
            for (Iterator iterator = matchingGuitars.iterator (); iterator.hasNext ();) {
                Guitar guitar = (Guitar)iterator.next ();
                System.out.println ("We have a " +
                        guitar.getBuilder () + " " + guitar.getModel () + " " +
                        guitar.getType () + " guitar:\n" +
                        guitar.getBackWood () + " back and sides,\n" +
                        guitar.getTopWood () + " top.\nYou can have it for only $" +
                        guitar.getPrice () + "!");
            }

        } else {
            System.out.println ("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar ("V95693", 1499.95, Builder.FENDER,"Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar ("V9512", 1549.95, Builder.FENDER,"Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }
}
