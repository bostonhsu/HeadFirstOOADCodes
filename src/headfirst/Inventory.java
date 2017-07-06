package headfirst;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/23.
 */
public class Inventory {
    private List inventory;

    public Inventory() {
        inventory = new LinkedList ();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = null;
        if (spec instanceof GuitarSpec) {
            instrument = new Guitar (serialNumber, price, (GuitarSpec) spec);
        } else if (spec instanceof MandolinSpec){
            instrument = new Mandolin (serialNumber, price, (MandolinSpec) spec);
        }
        inventory.add (instrument);
    }

    public Instrument get(String serialNumber) {
        for (Iterator iterator = inventory.iterator (); iterator.hasNext ();) {
            Instrument instrument = (Instrument)iterator.next ();
            if (instrument.getSerialNumber ().equals (serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList ();
        for (Iterator iterator = inventory.iterator (); iterator.hasNext ();) {
            Instrument instrument = (Instrument)iterator.next ();
            if (instrument instanceof Guitar) {
                Guitar guitar = (Guitar)instrument;
                if (guitar.getSpec ().matches (searchSpec))
                    matchingGuitars.add (guitar);
            }
        }
        return matchingGuitars;
    }

    public List search(MandolinSpec searchSpec) {
        List matchingMandolins = new LinkedList ();
        for (Iterator iterator = inventory.iterator (); iterator.hasNext ();) {
            Instrument instrument = (Instrument)iterator.next ();
            if (instrument instanceof Mandolin) {
                Mandolin mandolin = (Mandolin) instrument;
                if (mandolin.getSpec ().matches (searchSpec))
                    matchingMandolins.add (mandolin);
            }
        }
        return matchingMandolins;
    }
}
