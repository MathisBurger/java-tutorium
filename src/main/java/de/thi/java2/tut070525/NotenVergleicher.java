package de.thi.java2.tut070525;

import java.util.Comparator;

public class NotenVergleicher implements Comparator<Notenblatt> {

    @Override
    public int compare(Notenblatt notenblatt, Notenblatt t1) {
        // Warum geht das hier?
        return notenblatt.compareTo(t1);
    }
}
