# 🧠 Java-Übungen zu Vererbungsthemen

In dieser Übungsreihe erarbeitest du zentrale Konzepte der objektorientierten Vererbung in Java. Jede Aufgabe behandelt einen separaten Aspekt, passend zur Vorlesung *Programmierung in Java II (Kapitel 3)*.

---

## 🧹 Aufgabe 1: Zugriff auf geerbte Eigenschaften

```java
class Base {
    public int a;
    protected int b;
    int c;
    private int d;

    public void showBase() {
        System.out.println(a + ", " + b + ", " + c);
    }
}

class Child extends Base {
    public void modify() {
        a = 1;
        b = 2;
        c = 3;
        d = 4;
    }
}
```

**Aufgabe:**
1. Funktioniert die `modify` Funktion?
2. Füge eine Methode `printAll()` in `Child` hinzu, die `showBase()` nutzt.
---

## 🧹 Aufgabe 2: Konstruktion und Vererbung

```java
class Vehicle {
    protected String marke;

    public Vehicle(String marke) {
        this.marke = marke;
        System.out.println("Vehicle: " + marke);
    }
}
```

**Aufgabe:**
1. Erstelle zwei Klassen `Auto` und `Bagger`, die jeweils alle Eigenschaften von einem `Vehicle` erben und ergänze diese um sinnvolle spezifische Attribute

---

## 🧹 Aufgabe 3: Die Superklasse `Object`

```java
class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Item) {
            return this.name.equals(obj.name);
        }
        return false;
    }
}
```

**Aufgabe:**
1. Warum kann ich hier ein Object übergeben? Führt das nicht immer zu einem Fehler, wenn man ein anderes Item übergibt?

---

## 🧹 Aufgabe 4: Überschreiben geerbter Methoden

```java
class Animal {
    public String speak() {
        return "...";
    }
}

class Dog extends Animal {
    // Hier speak überschreiben
}
```

**Aufgabe:**
1. Überschreibe im Hund die Funktion speak, sodass er "Wuff" sagt

---

## 🧹 Aufgabe 5: `instanceof`-Operator

```java
class Shape {}
class Circle extends Shape {}
class Square extends Shape {}
```

**Aufgabe:**
1. `(new Circle()) instanceof Shape`
2. `(new Circle()) instanceof Circle`
3. `(new Circle()) instanceof Square`

---

## 🧹 Aufgabe 6: Abstrakte Klassen

```java
abstract class GeometricObject {
    public abstract double perimeter();
}

class Rectangle extends GeometricObject {
    private double width, height;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}
```

**Aufgabe:**
1. Kann ich eine **direkte** Instanz von `GeometricObject` erstellen?
2. Kann ich die Funktion `perimeter` auch aus der Rectangle Klasse entfernen
