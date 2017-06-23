package headfirst;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/23.
 */
public class Inventory {
    private List guitars;

    public Inventory() {
        guitars = new LinkedList ();
    }

    public void addGuitar(String serialNumber, double price,
                          String builder, String model,
                          String type, String backWood,
                          String topWood) {
        Guitar guitar = new Guitar (serialNumber, builder, model, type, backWood, topWood, price);
        guitars.add (guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator iterator = guitars.iterator (); iterator.hasNext ();) {
            Guitar guitar = (Guitar)iterator.next ();
            if (guitar.getSerialNumber ().equals (serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar) {
        for (Iterator iterator = guitars.iterator (); iterator.hasNext ();) {
            Guitar guitar = (Guitar)iterator.next ();
            String builder = searchGuitar.getBuilder ();
            if ((builder != null) && (!builder.equals ("")) && (!builder.equals (guitar.getBuilder ()))) {
                continue;
            }
            String model = searchGuitar.getModel ();
            if ((model != null) && (!model.equals ("")) && (!model.equals (guitar.getModel ()))) {
                continue;
            }
            String type = searchGuitar.getType ();
            if ((type != null) && (!type.equals ("")) && (!type.equals (guitar.getTopWood ()))) {
                continue;
            }
            String backWood = searchGuitar.getBackWood ();
            if ((backWood != null) && (!backWood.equals ("")) && (!backWood.equals (guitar.getBackWood ()))) {
                continue;
            }
            String topWood = searchGuitar.getTopWood ();
            if ((topWood != null) && (!topWood.equals ("")) && (!topWood.equals (guitar.getTopWood ()))) {
                continue;
            }
        }
        return null;
    }
}
