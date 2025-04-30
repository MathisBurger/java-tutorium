package de.thi.java2.tut290425.uebung;

public class ZulassungsDienst {

    public static KennzeichenArt getKennzeichenArt(Fahrzeug fahrzeug) {
        if (fahrzeug instanceof Trecker) {
            return KennzeichenArt.Landwirtschaft;
        }
        return KennzeichenArt.Normal;
    }

    public static void main(String[] args) {
        Trecker trecker = new Trecker();
        System.out.println(ZulassungsDienst.getKennzeichenArt(trecker));
    }
}
