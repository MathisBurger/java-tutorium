package de.thi.java2;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("CDU", "SPD", "AfD");
        list.stream()
                .map((s) -> s.toLowerCase())
                .filter(s -> s != "afd")
                .toList();


    }

    public static void demo() {
        List<String> list = Arrays.asList("CDU", "SPD", "AfD");

        List<String> newList = new ArrayList<>();
        for (String s : list) {
            newList.add(s.toLowerCase());
        }
    }
}
