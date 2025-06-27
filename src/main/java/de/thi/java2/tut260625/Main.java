package de.thi.java2.tut260625;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("file.mp3", ".mp3", "b.c",
                "a.", "abc", "42.txt");

        for (String s : strings) {
            int point = s.lastIndexOf(".");
            if (point > 0) {
                String name = s.substring(0, point);
                String ext = s.substring(point+1);
                if (name.length() > 0 && ext.length() > 0) {
                    System.out.println("file=" + name + ", ext=" + ext);
                }
            }
        }
    }
}
