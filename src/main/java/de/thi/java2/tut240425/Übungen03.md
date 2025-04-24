# 🧠 Java-Übungen zu Enums, Wrapper-Klassen, Autoboxing und Autounboxing

Dieses Übungsblatt behandelt zentrale Konzepte aus Kapitel 4 der Vorlesung *Programmierung in Java II*: Java-Enums, Wrapper-Klassen sowie automatische Konvertierungen zwischen primitiven Typen und Objekten (Autoboxing/Autounboxing).

---

## 🧹 Aufgabe 1: Java-Enums

```java
enum AmpelZustand {
    INAKTIV, ZEIGT_ROT, ZEIGT_ROT_GELB, ZEIGT_GRUEN, ZEIGT_GELB
}

public class Ampel {
    private AmpelZustand zustand;

    public Ampel(AmpelZustand zustand) {
        this.zustand = zustand;
    }

    public void printStatus() {
        System.out.printf("Ampel: %s (%d)%n", zustand.name(), zustand.ordinal());
    }
}
```

**Aufgabenstellung:**
1. Erstelle ein Objekt `Ampel` mit dem Zustand `ZEIGT_ROT`.
2. Gib den Namen und Index mit `printStatus()` aus.
3. Iteriere über alle möglichen Zustände mittels `AmpelZustand.values()` und gib sie aus.

---

## 🧹 Aufgabe 2: Wrapper-Klassen

```java
public class WrapperDemo {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(100);
        Integer i2 = new Integer(100);

        System.out.println("i1 == i2: " + (i1 == i2));
        System.out.println("i1.equals(i2): " + i1.equals(i2));
    }
}
```

**Aufgabenstellung:**
1. Erkläre die Unterschiede in der Ausgabe von `==` und `equals()`.
2. Teste auch mit dem Wert `128` statt `100` – was fällt auf?

---

## 🧹 Aufgabe 3: Autoboxing (einfacher Einstieg)

```java
public class BoxingDemo {
    public static void main(String[] args) {
        int a = 42;
        Integer b = a;
    }
}
```

**Aufgabenstellung:**
1. Funktioniert dieser Aufruf? Wenn ja, wieso?
---

## 🧹 Aufgabe 4: Autoboxing in Arrays

```java
public class ArrayBoxing {
    public static void main(String[] args) {
        int[] zahlen = {1, 2, 3, 4, 128};
        Integer[] wrapper = new Integer[zahlen.length];

        for (int i = 0; i < zahlen.length; i++) {
            wrapper[i] = zahlen[i]; // Autoboxing
        }

        for (Integer w : wrapper) {
            System.out.println(w.longValue() == 1337L);
        }
    }
}
```

**Aufgabenstellung:**
1. Erkläre, wie hier Autoboxing genutzt wird.

---

## 🧹 Aufgabe 5: Autounboxing in Vergleichen

```java
public class UnboxingVergleich {
    public static void main(String[] args) {
        Integer x = 100;
        int y = 100;

        if (x == y) {
            System.out.println("x == y (unboxed)");
        }
    }
}
```

**Aufgabenstellung:**
1. Erkläre, was beim Vergleich `x == y` passiert.
2. Ändere den Wert zu `Integer x = 128; int y = 128;` – wie ändert sich das Verhalten?

---

## 🧹 Bonusaufgabe: Enum mit Attributen und Konstruktor

```java
public enum Hunderasse {
    GOLDEN_RETRIEVER(0.61), DALMATINER(0.60), BEAGLE(0.41), DACKEL(0.30), MOPS(0.29);

    private final double hoehe;

    Hunderasse(double hoehe) {
        this.hoehe = hoehe;
    }

    public double getHoehe() {
        return hoehe;
    }
}

public class Hund {
    private String name;
    private int alter;
    private Hunderasse rasse;

    public Hund(String name, int alter, Hunderasse rasse) {
        this.name = name;
        this.alter = alter;
        this.rasse = rasse;
    }
    
    public String toString() {
        return name + " ist " + rasse.getHoehe() + " m hoch und " + alter + " Jahre alt.";
    }
}
```

**Aufgabenstellung:**
1. Erkläre, wie der Code funktioniert
2. Weshalb ist es sinnvoll das so zu schreiben?

