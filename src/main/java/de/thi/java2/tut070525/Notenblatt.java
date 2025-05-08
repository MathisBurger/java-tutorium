package de.thi.java2.tut070525;

public class Notenblatt implements Comparable {

    private int[] noten;

    private String studiengang;

    public Notenblatt(int[] noten, String studiengang) {
        this.noten = noten;
        this.studiengang = studiengang;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Notenblatt) {
            if (this.studiengang.equals("BWL")) {
                return 1;
            }
            if (((Notenblatt)o).studiengang.equals("BWL")) {
                return -1;
            }
            float durchschnittThis = this.getDurchschnitt();
            float durchschnittOther = ((Notenblatt)o).getDurchschnitt();

            return Float.valueOf(durchschnittThis).compareTo(durchschnittOther);
        }
        return 0;
    }

    public float getDurchschnitt() {
        int sum = 0;
        for (int note : this.noten) {
            sum += note;
        }
        return (float) sum / (float) this.noten.length;
    }
}
