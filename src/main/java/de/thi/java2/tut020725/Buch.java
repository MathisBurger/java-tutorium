package de.thi.java2.tut020725;

public class Buch implements Comparable<Buch> {

    String titel;

    String autor;

    int erscheinungsjahr;

    public Buch(String titel, String autor, int erscheinungsjahr) {
        this.titel = titel;
        this.autor = autor;
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public String toString() {
        return titel + " " + autor + " " + erscheinungsjahr;
    }

    public int compareTo(Buch o) {
        return titel.compareTo(o.titel);
    }
}
