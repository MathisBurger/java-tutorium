package de.thi.java2.tut020725;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Streams {

    public static void main(String[] args) {
        List<String> namen = new ArrayList<>(List.of("Anna", "Bernd", "Clara", "Bernd", "David", "Anna"));

        namen.stream()
                .filter(n -> n.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        Collections.sort(namen);
        for (String n : namen) {
            if (n.length() > 4) {
                System.out.println(n.toUpperCase());
            }
        }
    }
}
