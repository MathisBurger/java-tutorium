# Übungsaufgabe zur Objektorientierung

Dies ist eine Übung die sich auf viele verschiedene Faktoren der Objektorientierung fokussiert, um das allgemeine Verständnis für diese Themen zu stärken.

[Relevante Dateien](./)

### Ausgangssituation

Sie arbeiten in der IT der Zulassungsstelle des Freistaates Bayern. Ihr Abteilungsleiter hat Sie beauftragt das zentrale IT-System für den Zulassungsprozess zu entwickeln.

Hierfür sind bisher fünf leere Klassen gegeben. Die abstrakte Oberklasse `Fahrzeug` und die vier weiteren Klassen, die von dieser erben.


### Aufgabe 01

Nach Absprache mit der zuständigen Fachabteilung haben sie folgende Informationen erhalten:

Alle Fahrzeuge haben folgende Attribute: `leistung (int)`, `baujahr (int)`, `gewicht (int)`, `modellbezeichung (String)`, `kraftstoffart (Kraftstoffart)`.

Ein Auto hat die weiteren Attribute `kamera (boolean)`, `anzahlSitze (byte)`.

Ein Bagger hat die weiteren Attribute `armLaenge (int)`, `schaufelVolumen (int)`

Ein Panzer hat die weiteren Attribute `dickePanzerung (int)`, `hauptwaffeKaliber (int)`

Ein Trecker hat die weiteren Attribute `hydraulikDruck (int)`, `isoBus (boolean)`, `gps (boolean)`

Implementieren Sie die entsprechenden Attribute in den jeweiligen Klassen

### Aufgabe 02

Nun ist es Ihre Aufgabe Konstruktoren zu erstellen. Hierbei soll es pro Klasse immer zwei Konstruktoren geben. Einen Default-Konstruktor, der die von Ihnen gewählten Standard-Werte setzt und einen, der alle Attribute initialisiert mit jeweiligen Parametern.

**Achtung:** Im Altsystem gibt es viele Fahrzeuge mit unzulässigen Kraftstoffarten. Sie möchten, dass dieses Problem nicht auch im Neusystem auftritt. Es sind für de Fahrzeuge also nur ganz spezifische Kraftstoffarten zulässig. Werden im Konstruktor andere übergeben, als die zulässigen, werfen 
Sie bitte eine `RuntimeException`.

**Zulässige Kraftstoffe:**
- `Auto` => `Diesel`, `Benzin`
- `Bagger` => `Diesel`
- `Panzer` => `Oel`
- `Trecker` => `Diesel`

### Aufgabe 03

Die Beamten in der Zulassungsstelle sind massiv überlastet. Eine der schwierigen Aufgaben ist es, 
anhand der Fahrzeugart zu ermitteln, welche Art von Kennzeichen das Fahrzeug erhält. 

Auch wenn es oft Abweichungen gibt, sind die Standardwerte wiefolgt:

- `Trecker` => `Landwirtschaft`,
- `Panzer` => `Militaer`
- Rest => `Normal`

Nehmen sie die Klasse `ZulassungsDienst` und implementieren die vorgegebene Funktion so, dass abhängig von dem übergebenen Fortbewegungsmittel die jeweilige Kennzeichenart zurückgegeben wird.

### Aufgabe 04 

Sie haben soeben einen Anruf von dem Finanzamt des Freistaates erhalten. Sie sollen zusätzlich die jeweilig erhobenen Steuersätze pro Kennzeichen erhalten können.

**Wichtig:** Die Steuersätze sind pro Kennzeichenart immer gleich.

Der Chefentwickler im Finanzamt ist schon 64 Jahre alt und möchte vor seiner Rente möglich wenig Aufwand haben. 
Deshalb möchte er auch ihren `ZulassungsDienst` nutzen.

Sie haben ja bereits die Funktion `getKennzeichenArt` implementiert. Diese möchte er auch nutzen.

Er wünscht sich folgenden Aufruf: `ZulassungsDienst.getKennzeichenArt(...).getSteuersatz()`. Die Methode `getSteuersatz` liefert dann den jeweiligen Steuersatz, der für die Kennzeichenart anfällt.

Ist eine solche Implementierung überhaupt möglich? Was sagen die dem Entwickler?

**Antwortmöglichkeiten:**

- Nein, das geht nicht. `Kennzeichenart` ist ein Enum, da kann ich keine Funktionen drauf aufrufen / implementieren
- Das Leben ist kein Wunschkonzert, bau dir den Kram doch selbst!
- Ja, das ist möglich.


### Aufgabe 05

Nachdem der alte Hase Ihnen nun mehrfach lautstark klar gemacht hat, dass er schon als Entwickler gearbeitet hat, bevor Sie überhaupt geschlüpft sind knicken Sie ihm gegenüber ein.

Implementieren Sie nun also das von dem Chefentwickler gewünschte Verhalten, damit er danach erleichtert in Rente gehen kann.