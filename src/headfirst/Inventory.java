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

    public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
        Guitar guitar = new Guitar (serialNumber, spec, price);
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
            if (searchGuitar.getSpec ().getBuilder () != guitar.getSpec ().getBuilder ())
                continue;
            String model = searchGuitar.getSpec ().getModel ().toLowerCase ();
            if ((model != null) && (!model.equals ("")) && (!model.equals (guitar.getSpec ().getModel ().toLowerCase ())))
                continue;
            if (searchGuitar.getSpec ().getType () != guitar.getSpec ().getType ())
                continue;
            if (searchGuitar.getSpec ().getBackWood () != guitar.getSpec ().getBackWood ())
                continue;
            if (searchGuitar.getSpec ().getTopWood () != guitar.getSpec ().getTopWood ())
                continue;
            matchingGuitars.add (guitar);
        }
        return matchingGuitars;
    }
}
