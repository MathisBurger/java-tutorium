package de.thi.java2.tut260625;

import java.util.Collections;
import java.util.Comparator;

public class Comp implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return -p1.getName().compareTo(p2.getName());
    }
}

public class Aufgabe1a  {

    public static void main(String[] args) {
        button.setOnAction(new EventHandler() {
            public void handle(Event e) {
                Collections.sort(liste, new Comp());
                listView.setItems(liste);
            }
        });
    }
}
