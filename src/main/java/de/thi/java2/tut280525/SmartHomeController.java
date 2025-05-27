package de.thi.java2.tut280525;

import java.util.*;

public class SmartHomeController {

    public static List<?> geraeteErzeugen() {
        List<?> geraeteListe = new ArrayList<>();

        SmartLamp lamp = new SmartLamp("Wohnzimmerlampe");
        CleaningRobot robot = new CleaningRobot("Saugroboter");

        geraeteListe.add(lamp);
        geraeteListe.add(robot);
        return geraeteListe;
    }

    public static void mainFunktion(List<?> geraeteListe) {


        for (? d : geraeteListe) {
            // TODO: Geräte einschalten
        }

        // Einstellungen vornehmen
        for (? d : geraeteListe) {
            // TODO: Wert auf 75 setzen
        }

        for (? d : geraeteListe) {
            // TODO: Geräte, die einbeschaltet werden können und einen regelbaren Wert haben einschalten und auf 100 % stellen
        }

        // TODO: Status aller Geräte ausgeben
    }

    public static void alleLampenAufMax(List<Device> geraete) {
        // TODO: Alle Lampen sollen in allen Einstellungen auf das Maximum gesetzt werden.
    }
}

