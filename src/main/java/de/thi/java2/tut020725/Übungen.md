## Collections 01
```java
List<String> namen = new ArrayList<>(List.of(
"Anna", "Bernd", "Clara", "Bernd", "David", "Anna"
));
```
**Teilaufgaben:**

Erstelle ein Set<String>, das alle Namen ohne Duplikate enthält. Gib das Ergebnis auf der Konsole aus.

Sortiere die Liste alphabetisch mit Collections.sort(). Warum funktioniert das nicht direkt mit einem Set?

**Reflexionsfragen:**

Wann ist Set besser geeignet als List?

Warum kann man Set-Elemente nicht direkt sortieren?

## Collections 02

**Szenario:**
Ein kleines Archiv verwaltet Bücher und möchte diese sortieren und iterierbar machen. Du sollst eine Klasse Buch entwerfen und in eine Klasse BuecherArchiv einbauen, die alle Bücher speichert und Funktionen zum Sortieren und Iterieren bereitstellt.

### Teil 1: Klasse Buch

**Anforderungen:**

Erstelle eine Klasse Buch mit den Attributen:
```java
String titel;

String autor;

int erscheinungsjahr;
```

Implementiere die Methode toString(), um Titel, Autor und Jahr kompakt auszugeben.

Überlege dir nun eine Methode, mit der sich zwei Bücher verleichen lassen und implementiere diese.
Die natürliche Ordnung soll nach titel (alphabetisch) erfolgen.


### Teil 2: Eigener Comparator für Sortierung nach Erscheinungsjahr

**Aufgaben:**

Erstelle eine Klasse `BuchJahrComparator`, die `Comparator<Buch>` implementiert.

Sortiere Bücher damit aufsteigend nach Erscheinungsjahr.

Gib die sortierte Liste aus.

### Teil 3: Die Klasse BuecherArchiv

**Aufgaben:**

Erstelle die Klasse `BuecherArchiv`, die intern eine `List<Buch>` verwaltet.

Füge Methoden hinzu:

`void buchHinzufuegen(Buch b)`

`void sortiereNachTitel()` → verwendet Comparable

`void sortiereNachJahr()` → verwendet den Comparator

Man soll zusätzlich mit foreach über das Bucharchiv iterieren können. Wie kann ich das umsetzen? Implementiere.

## Streams

```java
List<String> namen = List.of("Anna", "Bernd", "Clara", "Bernd", "David", "Anna");
```
**Teil A – Mit Stream:**

Nur Namen mit mehr als 4 Buchstaben.

Wandle alle Namen in Großbuchstaben um.

Sortiere sie alphabetisch und gib sie aus.

**Teil B - Ohne Streams (klassisch)**

Setze die obige Logik mit klassischem Java-Code ohne Stream API um (z.B. for, if, Collections.sort() etc.).
