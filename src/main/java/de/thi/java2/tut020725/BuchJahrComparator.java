package de.thi.java2.tut020725;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BuchJahrComparator implements Comparator<Buch> {

    public static void main(String[] args) {
        List<Buch> dreiFragezeichen = new ArrayList<>();

        dreiFragezeichen.add(new Buch("Die drei ??? und das Gespensterschloss", "Robert Arthur", 1968));
        dreiFragezeichen.add(new Buch("Die drei ??? und der Phantomsee", "William Arden", 1968));
        dreiFragezeichen.add(new Buch("Die drei ??? und der Karpatenhund", "William Arden", 1969));
        dreiFragezeichen.add(new Buch("Die drei ??? und die schwarze Katze", "William Arden", 1969));
        dreiFragezeichen.add(new Buch("Die drei ??? und der Fluch des Rubins", "Robert Arthur", 1969));

        dreiFragezeichen.sort(new BuchJahrComparator());

        for (Buch buch : dreiFragezeichen) {
            System.out.println(buch);
        }
    }

    public int compare(Buch buch1, Buch buch2) {
        return buch1.erscheinungsjahr - buch2.erscheinungsjahr;
    }
}
