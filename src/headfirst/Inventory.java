package headfirst;

import java.util.ArrayList;
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
                          Builder builder, String model,
                          Type type, Wood backWood,
                          Wood topWood) {
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

    public List search(Guitar searchGuitar) {
        List matchingGuitars = new ArrayList ();
        for (Iterator iterator = guitars.iterator (); iterator.hasNext ();) {
            Guitar guitar = (Guitar)iterator.next ();
            if (searchGuitar.getBuilder () != guitar.getBuilder ())
                continue;
            String model = searchGuitar.getModel ().toLowerCase ();
            if ((model != null) && (!model.equals ("")) && (!model.equals (guitar.getModel ().toLowerCase ())))
                continue;
            if (searchGuitar.getType () != guitar.getType ())
                continue;
            if (searchGuitar.getBackWood () != guitar.getBackWood ())
                continue;
            if (searchGuitar.getTopWood () != guitar.getTopWood ())
                continue;
            matchingGuitars.add (guitar);
        }
        return matchingGuitars;
    }
}
