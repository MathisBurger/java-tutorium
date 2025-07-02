package de.thi.java2.tut020725;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BuecherArchiv implements Iterable<Buch>{

    private List<Buch> buches;


    public BuecherArchiv() {
        buches = new ArrayList<>();
    }

    void buchHinzufuegen(Buch buch) {
        buches.add(buch);
    }

    void sortiereNachTitel() {
        Collections.sort(buches);
    }

    void sortiereNachJahr() {
        Collections.sort(buches, new BuchJahrComparator());
    }

    @Override
    public Iterator<Buch> iterator() {
        return buches.iterator();
    }
}
