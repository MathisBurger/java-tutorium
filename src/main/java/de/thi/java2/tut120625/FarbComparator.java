package de.thi.java2.tut120625;

import java.util.Comparator;

public class FarbComparator implements Comparator<Farbe> {

    @Override
    public int compare(Farbe farbe, Farbe t1) {
        if (farbe == null && t1 == null) {
            return 0;
        }

        if (farbe == null) {
            return 1;
        }
        if (t1 == null) {
            return -1;
        }

        int compRot = Integer.compare(farbe.getRot(), t1.getRot());
        if (compRot != 0) {
            return compRot;
        }
        // Ab hier gleicher Rotwert: compRot == 0
        int compGruen = Integer.compare(farbe.getGruen(), t1.getGruen());
        if (compGruen != 0) {
            return compGruen;
        }

        // Ab hier gleicher Grünwert: compGruen == 0

        return Integer.compare(farbe.getBlau(), t1.getBlau());
    }
}
