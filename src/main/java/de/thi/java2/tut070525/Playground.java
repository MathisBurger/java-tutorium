package de.thi.java2.tut070525;

import java.util.Arrays;
import java.util.List;

public class Playground {

    public static void main(String[] args) {

        Notenblatt o1 = new Notenblatt(new int[] {1,1,1}, "WINF");
        Notenblatt o2 = new Notenblatt(new int[] {1,2,1}, "WINF");
        System.out.println(o1.compareTo(o2));

        List<Notenblatt> blaetter = Arrays.asList(o1, o2);
        blaetter.sort(new NotenVergleicher());

        // Jetzt sortiert
        System.out.println(blaetter);

    }
}
