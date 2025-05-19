

## Aufgabe 01

Wird dieser Code kompilieren?

```java
class MyException extends Exception {
    public MyException() {
        super();
    }
    
    public static void main(String[] args) {
        throw new MyException();
    }
}
```

## Aufgabe 02

Was passiert in folgenden Code-Abschnitten
```java
try {
    throw new MyException();
} catch (RuntimeException e) {
    e.printStackTrace();
}
```

```java
try {
    int[] arr = new int[] {1,2};
    System.out.println(arr[2]);
} catch (Exception e) {
    e.printStackTrace();
}
```

```java
try {
    int[] arr = new int[] {1,2};
    System.out.println(arr[2]);
} catch (MyException e) {
    e.printStackTrace();
}
```

```java
try {
    Notenblatt nb;
    nb.getDurchschnitt();
} catch (Throwable e) {
    e.printStackTrace();
}
```

## Aufgabe 03

Im Folgenden findet ihr einige kleinere Übungsaufgaben, die den praktischen Nutzen von Exceptions zeigen sollen.

### 3.1

Schreiben Sie ein Java-Programm, das zwei Ganzzahlen einliest und die Division durchführt. Fangen Sie die Ausnahme ab, wenn eine Division durch Null erfolgt, und geben Sie eine passende Fehlermeldung aus.

**Hinweis:** Für diesen Fall einer fehlerhaften Division gibt es eine vordefinierte Exception in der Java-Standardbibliothek. Nutzen Sie für das einlesen die `Scanner`-Klasse.


### 3.2

Nachdem ihr nun eine fehlerhafte Division abfangen könnt, müsst ihr nun noch fehlerhafte Eingaben abfangen. 

Fragen Sie den Benutzer nach einer Ganzzahl. Wenn der Benutzer keine Zahl eingibt, soll eine Ausnahme (`InputMismatchException`) abgefangen und eine Meldung ausgegeben werden.

### 3.3

Es gibt folgende ungeschriebene Regel: (Eigenes Alter / 2) +7 = das Mindestalter des Partners.

Kopfrechnen ist nun ein sehr anstrengender Prozess und ihr wollt die Berechnung automatisieren. 

Erstellt eine neue Klasse, die zwei Ganzzahlen einliest (Ihr Alter und das Alter des potentiellen Partners). Wenden sie nun diese ungeschriebene Regel an. 
Trifft die Regel nicht zu, werfen sie eine Exception mit entsprechender Fehlermeldung.


### 3.4

Nun soll es auch eine mögliche Obergrenze geben. Nutzen Sie nun also die umgekehrte Formel: (eigenes alter -7) * 2
Ist der potentielle Partner älter als das das maximal erlaubte Alter werfen sie eine andere Exception.

Sie benötigen also zwei eigene Exceptions: `TooYoungException` und `TooOldException`.

Fangen sie in ihrer Main-Funktion und diese Exceptions ab und geben sie abhängig von der Exception-Art eine Fehlermeldung raus.


