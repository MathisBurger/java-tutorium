## Übung 01

### 1.1
Die Klausuren sind rum und ihr wollt eure Noten automatisch miteinander vergleichen. Dazu müsst ihr eure Notenblätter vergleichen.

Erstelle also dafür nun zuerst eine Klasse `Notenblatt.java`. Diese hat folgende Attribute:

- `int[] noten`
- `String studiengang`

Diese sollen durch einen Konstruktor gesetzt werden können. Es gibt keinen Default-Konstruktor.

### 1.2

Nun könnt ihr eure eigenen Notenblätter verwenden. Ihr wollt euer eigenes Notenblatt nun mit dem eures Sitznachbarn vergleichen.
Nur mit eurem Sitzbachbar. Also immer nur mit **einer** anderen Person.

Kennt ihr ein Interface, das ihr hierfür verwenden könnt?

### 1.3

Implementieren sie nun dieses Interface auf ihrer Klasse `Notenblatt`.

Es soll folgende Logik umgesetzt werden:

- Ist das übergebene Objekt kein Notenblatt, so soll es dem Notenblatt **gleich** sein.
- Ist ihr Notendurchschnitt größer als der ihres Sitznachbarn sollen sie nachgelagert sein (return 1). Ist ihr Durchschnitt kleiner dann (return -1)
- Studieren sie BWL, sind sie generell immer nachgelagert (return 1). Studiert ihr Sitznachbar BWL, so sind die diesem vorgeordnet (return -1)

### 1.4

Wofür ist dieses Interface überhaupt hilfreich?

## Übung 02

### 2.1

Jetzt könnt ihr euch zu zweit vergleichen. Nach 5 Minuten ist das aber langweilig geworden. Euer Plan ist es, ein Leaderboard zu bauen.

Implemtiert dazu als erstes die Klasse `Notenvergleicher.java`

### 2.2

Wir wollen später folgendes Verhalten:

```java
List<Notenblatt> blaetter = Arrays.asList(o1, o2);
blaetter.sort(new NotenVergleicher());

// Jetzt sortiert
System.out.println(blaetter);
```

Was müssen wir machen, damit wir diesen Verhalten erzielen können?

### 2.3

Implementieren sie dieses Verhalten nach den Vorgaben aus Aufgabe 1.3

## Übung 03

Sie arbeiten in der IT-Abteilung eines großen Archives. Sie haben tagtäglich mit vielen verschiedenen Textsorten zu tun.

Ihr Chef hat sie nun beauftragt, dass sie ein System bauen sollen, dass für jeden erdenklichen Text eine Kurzzusammenfassung generieren kann und relevante Meta-Daten ausgeben kann.

Meta-Daten sollen getrennt von der Zusammenfassung ausgegeben werden können.

### 3.1

Erstellen sie Klassen zu folgenden Textsorten und überlegen sie sich mögliche Attribute (1-2 pro Klasse genügen): `Ballade`, `Leserbrief`, `Sachtext`

### 3.2

Welches Prinzip der OOP kann in diesem Fall angewendet werden, um dies umzusetzen.

### 3.3

Definieren sie nun das Interface. Meta-Daten und Zusammenfassung haben beide den Datentypen `String`.

Implementieren sie anschließend das Interface für alle Textsorten. 

Folgendes Verhalten soll anschließend möglich sein:

```java
import java.util.ArrayList;
import java.util.Arrays;

List<TextInterface> texte = Arrays.asList(new Ballade(), new Leserbrief(), new Sachtext());
for (TextInterface text : texte) {
    System.out.println("Meta: " + text.getMeta());
    System.out.println("Abstract: " + text.getZusammenfassung());
}
```

# Übung 04

### 4.1 

```java
class Demo<T, E> {
    
    public T getSomething(E params) {
        return params.convertSomehow();
    }
}
```
Wofür steht hier das `T` und das `E`?

### 4.2

Gegeben sind folgende Klassen:

```java
class GeometricObjekt {
}

class Quadrat extends GeometricObject {
}

class Kreis extends GeometricObject {}
```

Welcher Code funktioniert und welcher nicht?

```java
import java.util.ArrayList;

List list = new ArrayList();
list.add(new Quadrat());
list.add(new Kreis());

for (Kreis kreis : list) {
    System.out.println(kreis.toString())
}
```

```java
import java.util.ArrayList;

List<Object> list = new ArrayList<Object>();
list.add(new Quadrat());
list.add(new Kreis());

for (Object obj : list) {
    System.out.println(obj.toString());
}
```

```java
import java.util.ArrayList;

List<Kreis> list = new ArrayList<Kreis>();
list.add(new Quadrat());
list.add(new Kreis());

for (Object obj : list) {
    System.out.println(obj.toString());
}
```

```java
import java.util.ArrayList;

List<GeometricObject> list = new ArrayList<GeometricObject>();
list.add(new Quadrat());
list.add(new Kreis());

for(Object obj :list){
    System.out.println(obj.toString());
}
```

### 4.3

Was ist das Ergebnis dieses Codes?

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

Object obj1 = new Object();
Object obj2 = new Object();

List<Object> list = new ArrayList<Object>();
list.add(obj1);
list.add(obj1);
list.add(obj2);
Set<Object> set = new HashSet<Object>();
set.add(obj1);
set.add(obj1);
set.add(obj2);

System.out.println(list.size() == set.size())
```

### 4.4

Grundlegende Fragen zu Collections:

- Alle Collections können mit Generics "verfeinert" werden. Wahr oder Falsch?
- Was ist der Unterschied zwischen einer List und einem Set?
- Was ist der Unterschied zwischen einer Map und einer List?

## Übung 05

### 5.1

Ihr könnt jetzt schon eure Noten sortieren. Nun könnt ihr euer Leaderboard final bauen.

Erstellt eine Klasse `Leaderboard.java`. Die Klasse hat **keinen** Default-Konstruktor und einen Konstruktur, der eine `List<Notenblatt>` nimmt und sie sortiert in ein Attribut speichert.

Am Ende soll dann folgende Logik möglich sein:


```java
Leaderboard leaderboard = new Leaderboard(notenblaetter);

for (Notenblatt blatt : leaderboard) {
    System.out.println(blatt);
}
```
**Tipp:** Mit `list.iterator()` erhält man eine Instanz des `Iterator<T>`-Interfaces.

### 5.2

Erstellt eine zweite Klasse `LeaderboardWithArray`. Diese hat im Prinzip die gleiche Funktionalität wie die bisherige `Leaderboard`-Klasse. Der Unterschied ist, dass anstelle einer `List<T>` ein Array verwendet wird.

Was müssen wir nun tun, damit wir trotzdem das `Iterable`-Interface nutzen können?

### 5.3

Erstellen sie eine Klasse `ArrayIterator`, die nun das `Iterator`-Interface implementiert und über das Array rüber iteriert.

Nutzen sie diesen Iterator nun in ihrer `LeaderboardWithArray`-Klasse.