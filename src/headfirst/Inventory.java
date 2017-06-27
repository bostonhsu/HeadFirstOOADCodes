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

    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new ArrayList ();
        for (Iterator iterator = guitars.iterator (); iterator.hasNext ();) {
            Guitar guitar = (Guitar)iterator.next ();
            GuitarSpec guitarSpec = guitar.getSpec ();
            if (guitar.getSpec ().matches (searchSpec))
                matchingGuitars.add (guitar);

            matchingGuitars.add (guitar);
        }
        return matchingGuitars;
    }
}
