package de.thi.java2.tut070525;

public class Leserbrief implements TextInterface {

    private String empfaenger;

    public Leserbrief(String empfaenger) {
        this.empfaenger = empfaenger;
    }

    @Override
    public String getMeta() {
        return "Metadaten für einen Leserbrief";
    }

    @Override
    public String getZusammenfassung() {
        return this.empfaenger + " ist der Empfänger";
    }
}
