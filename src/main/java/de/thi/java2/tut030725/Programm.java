package de.thi.java2.tut030725;

public class Programm {

    public static void main(String[] args) {


        // ....
        try {
            Programm.test(args);
        } catch (TestException e) {
            System.out.println("Ein Fehler ist aufgetreten");
            // ...
        }
    }

    private static void test(String[] args) throws TestException {
        if (args.length != 1) {
            throw new TestException("sdlgkjhdghj");
        }
    }
}
