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