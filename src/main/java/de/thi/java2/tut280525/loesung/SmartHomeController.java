package de.thi.java2.tut280525.loesung;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {

    public static List<Device> geraeteErzeugen() {
        List<Device> geraeteListe = new ArrayList<>();

        SmartLamp lamp = new SmartLamp("Wohnzimmerlampe");
        CleaningRobot robot = new CleaningRobot("Saugroboter");

        geraeteListe.add(lamp);
        geraeteListe.add(robot);
        return geraeteListe;
    }

    public static void mainFunktion(List<Device> geraeteListe) {


        for (Device d : geraeteListe) {
            if (d instanceof Switchable) {
                Switchable switchable = (Switchable) d;
                switchable.turnOn();
            }
        }

        // Einstellungen vornehmen
        for (Device d : geraeteListe) {
            if (d instanceof Adjustable) {
                Adjustable adjustable = (Adjustable) d;
                adjustable.setLevel(75);
            }
        }

        for (Device d : geraeteListe) {
            if (d instanceof Switchable && d instanceof Adjustable) {
                Switchable switchable = (Switchable) d;
                switchable.turnOn();
                Adjustable adjustable = (Adjustable) d;
                adjustable.setLevel(100);
            }
        }

        for (Device d : geraeteListe) {
            System.out.println(d.getStatus());
        }
    }

    public static void alleLampenAufMax(List<Lamp> geraete) {
        for (Lamp d : geraete) {
            d.turnOn();
            if (d instanceof Adjustable) {
                Adjustable adjustable = (Adjustable) d;
                adjustable.setLevel(100);
            }
        }
    }
}

