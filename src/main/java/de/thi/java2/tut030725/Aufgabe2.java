package de.thi.java2.tut030725;

import java.util.*;

public class Aufgabe2 {

    static public void main(String[] args) {
        String[] csvDatei = {
                "Nr;Name;VorgesetzterNr;Gehalt;Ort;PLZ;Strasse;HausNr",
                "4711;Claire;-1;3500.0;Ingolstadt;85049;Rathaus;1",
                "4712;Haley;4711;2500.0;Ingolstadt;85049;Esplanade;10",
                "4713;Phil;4711;2400.0;Eitensheim;12345;Am Weg;20"
        };
        Map<Integer, Mitarbeiter> mitarbeiter = dateiEinlesen(csvDatei);
        mitarbeiterAusgeben(mitarbeiter, ""); System.out.println("---");
        mitarbeiterAusgeben(mitarbeiter, "ort");
    }

    private static Map<Integer, Mitarbeiter> dateiEinlesen(String[] csvDatei) {
        Map<Integer, Mitarbeiter> map = new HashMap<>();

        for (int i = 1; i < csvDatei.length; i++) {
            String[] split = csvDatei[i].split(";");
            int mNr = Integer.parseInt(split[0]);
            String name = split[1];
            int vgNr = Integer.parseInt(split[2]);
            float gehalt = Float.parseFloat(split[3]);
            String ort = split[4];
            int plz = Integer.parseInt(split[5]);
            String strasse = split[6];
            int hausNr = Integer.parseInt(split[7]);

            Adresse adresse = new Adresse(plz, hausNr, ort, strasse);
            Mitarbeiter m = new Mirarbeiter(mNr, name, vgNr, gehalt, adresse);
            map.put(mNr, m);
        }

        return map;

    }

    private static void mitarbeiterAusgeben(Map<Integer, Mitarbeiter> mitarbeiter,
                                            String sortierung) {

        List<Mitarbeiter> list = new ArrayList<>(mitarbeiter.values());

        if (sortierung.equals("ort")) {
            list.sort(( m1, m2) -> {
                int comp = m1.getAdresse().getOrt().compareTo(m2.getAdresse().getOrt());
                if (comp != 0) {
                    return comp;
                }
                return m1.getAdresse().getStrasse().compareTo(m2.getAdresse().getStrasse());
            });
        } else if (sortierung.isEmpty()) {
            Collections.sort(list);
        }

        for (Mitarbeiter m : list) {
            System.out.println(m);
        }
    }
}
