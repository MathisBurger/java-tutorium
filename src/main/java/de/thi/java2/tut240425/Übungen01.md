# 🧠 Übungen zu Java: Methodenüberladung, `this` und Parameterübergabe

## 🧹 Aufgabe 1: Methodenüberladung

```java
public class Printer {
    void printValue(String value) {
        System.out.println("Text: " + text);
    }

    void printValue(int value) {
        System.out.println("Integer: " + text);
    }

    void printValue(double value) {
        System.out.println("Integer: " + text);
    }
}
```

**Aufgabenstellung:**
1. Funktioniert dieses Konstrukt? Wenn ja, warum?
2. Welche Ergebnisse kommen bei folgenden Aufrufen zustande:

```java
Printer printer = new Printer();
printer.printValue("Hallo Welt");
printer.printValue(3.1f);
printer.printValue(3.1);
printer.printValue(3);
```

---

## 🧹 Aufgabe 2: `this`-Referenz bei Attributzuweisung

```java
public class Circle {
    double radius;

    public Circle(double radius) {
        // Was muss hier rein?
    }

    void printInfo() {
        System.out.println("Radius: " + radius);
    }
}
```

**Aufgabenstellung:**
1. Weise im Konstruktor den Parameter korrekt dem Attribut zu.
2. Erzeuge ein Objekt mit `new Circle(2.5)` in der `main`-Methode und rufe `printInfo()` auf.

---


## 🧹 Aufgabe 3: Parameterübergabe – Call by Value

```java
class Demo {
    int x = 5;

    void modifyPrimitive(int value) {
        value += 10;
    }

    void modifyObject(Demo d) {
        d.x += 10;
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        int val = 10;

        d.modifyPrimitive(val);
        System.out.println("val nach modifyPrimitive: " + val);

        d.modifyObject(d);
        System.out.println("d.x nach modifyObject: " + d.x);
    }
}
```

**Fragen:**
1. Warum bleibt `val` unverändert?
2. Warum ändert sich `x`?

---