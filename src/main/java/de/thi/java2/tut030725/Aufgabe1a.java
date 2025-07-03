package de.thi.java2.tut030725;

import java.util.ArrayList;
import java.util.Collections;

public class Aufgabe1a {

    public static void main(String[] args) {
        Student[] liste = { new Student("Anna", 29, 4711), new Student("Maria", 17, 5012),
                new Student("Peter", 25, 9876) };

        List<Person> list2 = new ArrayList<>();
        for (Student s : liste) {
            if (s.getAlter() >= 18) {
                list2.add(new Person (s.getName(), s.getAlter()));
            }
        }
        Collections.sort(list2);
        for (Person p : list2) {
            System.out.println(p);
        }
    }
}
