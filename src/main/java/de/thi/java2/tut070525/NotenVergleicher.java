package de.thi.java2.tut070525;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NotenVergleicher implements Comparator<Notenblatt> {

    @Override
    public int compare(Notenblatt notenblatt, Notenblatt t1) {
        // Warum geht das hier?
        return notenblatt.compareTo(t1);
    }

    public static void main(String[] args) {
        Notenblatt o1 = new Notenblatt(new int[] {1,2,3}, "WINF");
        Notenblatt o2 = new Notenblatt(new int[] {1,2,4}, "WINF");
        List<Notenblatt> notenblatten = Arrays.asList(o2, o1);
        notenblatten.sort(new NotenVergleicher());
        System.out.println(notenblatten);
    }
}
