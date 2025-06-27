package de.thi.java2.tut260625;

public class Aufgabe1b {

    public static void main(String[] args) {
        ObservableList<Person> liste = FXCollections.observableArrayList();
        final int maxLaenge = Integer.valueOf(laengeFeld.getText());
        for (Person p : personenListe) {
            if (p.getName().length() <= maxLaenge) {
                liste.add(p);
                System.out.println(p);
            }
        }
    }
}
