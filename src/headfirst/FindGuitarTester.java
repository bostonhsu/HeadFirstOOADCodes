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

        GuitarSpec whatErinLikes = new GuitarSpec (Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);
        List matchingGuitars = inventory.search (whatErinLikes);
        if (!matchingGuitars.isEmpty ()) {
            System.out.println ("Erin, you might like these guitars:");
            for (Iterator iterator = matchingGuitars.iterator (); iterator.hasNext ();) {
                Guitar guitar = (Guitar)iterator.next ();
                GuitarSpec spec = (GuitarSpec) guitar.getSpec ();
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

        System.out.println ("---------------------\n--------------searching mandolin--------");

        MandolinSpec whatDouLikes = new MandolinSpec (Builder.GIBSON, "BostonHsu", Type.ACOUSTIC, Wood.COCOBOLO, Wood.COCOBOLO, Style.A);
        List matchingMandolins = inventory.search (whatDouLikes);
        if (!matchingMandolins.isEmpty ()) {
            System.out.println ("Dou, you might like these mandolins:");
            for (Iterator iterator = matchingMandolins.iterator (); iterator.hasNext ();) {
                Mandolin mandolin = (Mandolin) iterator.next ();
                MandolinSpec spec = (MandolinSpec) mandolin.getSpec ();
                System.out.println ("We have a " +
                        spec.getBuilder () + " " + spec.getModel () + " " +
                        spec.getType () + " mandolin:\n" +
                        spec.getBackWood () + " back and sides,\n" +
                        spec.getTopWood () + " top.\nYou can have it for only $" +
                        mandolin.getPrice () + "!");
            }

        } else {
            System.out.println ("Sorry, Dou, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addInstrument ("V95693", 1499.95, new GuitarSpec (Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12));
        inventory.addInstrument ("V9512", 1549.95, new GuitarSpec (Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12));
        inventory.addInstrument ("M01", 3398.21, new MandolinSpec (Builder.GIBSON, "BostonHsu", Type.ACOUSTIC, Wood.COCOBOLO, Wood.COCOBOLO, Style.A));
        inventory.addInstrument ("M02", 2152.38, new MandolinSpec (Builder.GIBSON, "BostonHsu", Type.ACOUSTIC, Wood.COCOBOLO, Wood.COCOBOLO, Style.F));
    }
}
