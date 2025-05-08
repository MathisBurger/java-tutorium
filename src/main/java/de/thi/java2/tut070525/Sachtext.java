package de.thi.java2.tut070525;

public class Sachtext implements TextInterface {

    public String fachbereich;

    public Sachtext(String fachbereich) {
        this.fachbereich = fachbereich;
    }

    @Override
    public String getMeta() {
        return "Metadaten für einen Sachtext des Fachbereis" +  this.fachbereich;
    }

    @Override
    public String getZusammenfassung() {
        return "Zusammenfassung";
    }
}
