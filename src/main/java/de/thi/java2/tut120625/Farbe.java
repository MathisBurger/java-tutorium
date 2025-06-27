package de.thi.java2.tut120625;

import java.util.*;

public class Farbe {
    private int rot;
    private int gruen;
    private int blau;

    public Farbe(int rot, int gruen, int blau) {
        this.rot = rot;
        this.gruen = gruen;
        this.blau = blau;
    }
    public int getRot() { return rot; }
    public int getBlau() { return blau; }
    public int getGruen() { return gruen; }
    public int hashCode() { /*…*/ }
    public boolean equals(Object o) { /*…*/ }


    public static void main(String[] args) {
        String[] tokens = new String[] {
                "rot", "255", "0", "0",
                "weiss", "255", "255", "255",
                "türkis", "0", "255", "255",
                "orange", "255", "165", "0",
                "grau", "128", "128", "128" };
        Map<Farbe, String> map = verarbeiten(tokens);
        ausgeben(map);
    }

    public static Map<Farbe, String> verarbeiten(String[] tokens) {

        HashMap<Farbe, String> map = new HashMap<Farbe, String>();

        for (int i = 0; i < tokens.length / 4; i++) {
            String name = tokens[i * 4];
            int rot = Integer.parseInt(tokens[i * 4 + 1]);
            int gruen = Integer.parseInt(tokens[i * 4 + 2]);
            int blau = Integer.parseInt(tokens[i * 4 + 3]);
            Farbe farbe = new Farbe(rot, gruen, blau);
            map.put(farbe, name);
        }

        return map;
    }

    private static void ausgeben(Map<Farbe, String> map) {
        Farbe[] farbeList = (Farbe[]) map
                .keySet() // Set<Farbe>
                .stream() // Stream<Farbe>
                .sorted(new FarbComparator()) // Stream<Farbe> aber sortiert
                .toArray(); // Object[]

        for (Farbe farbe : farbeList) {
            String farbeName = map.get(farbe);

            // Möglichkeit 1
            String output = String.format("%d,%d,%d = %s", farbe.getRot(), farbe.getGruen(), farbe.getBlau(), farbeName);
            System.out.println(output);

            // Möglichkeit 2
            System.out.printf("%d,%d,%d = %s\n", farbe.getRot(), farbe.getGruen(), farbe.getBlau(), farbeName);
        }
    }
}