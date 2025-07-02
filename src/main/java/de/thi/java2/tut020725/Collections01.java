package de.thi.java2.tut020725;

import java.util.*;

public class Collections01 {

    public static void main(String[] args) {
        List<String> namen = new ArrayList<>(List.of(
                "Anna", "Bernd", "Clara", "Bernd", "David", "Anna"
        ));

        // Teilaufgabe 01
        Set<String> set = new HashSet<>(namen);
        for (String s : set) {
            System.out.println(s);
        }

        // Teilaufgabe 02
        Collections.sort(namen);

    }
}
