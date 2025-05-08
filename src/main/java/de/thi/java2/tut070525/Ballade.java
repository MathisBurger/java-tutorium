package de.thi.java2.tut070525;

public class Ballade implements TextInterface {

    private String text23;

    public Ballade(String text23) {
        this.text23 = text23;
    }

    @Override
    public String getMeta() {
        return "Metadaten einer Ballade";
    }

    @Override
    public String getZusammenfassung() {
        return this.text23;
    }
}
