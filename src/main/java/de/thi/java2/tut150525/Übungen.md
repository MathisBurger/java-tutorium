# Übungen für das Tutorium am 15.05.02025

Es wird langsam Sommer und die Festival Saison geht wieder los. Euer Onkel hat vor einer Woche eine Doku über die Wacken Brüder gesehen und plant nun Ingolstadt ein wenig mehr Kultur zu geben und will ein ähnliches Festival entlang der Donau etablieren. 

Ihr findet die Idee genial und wollt ihm helfen ein digitales Ticket-System zu bauen. 
Auf dem Festival gibt es drei verschiedene Arten an von Tickets:

- `Tagesticket`
- `Mehrtagesticket`
- `Gesamtticket`

Alle diese Ticketarten haben eine Oberklasse `Ticket`. Zudem soll in der Klasse `Ticket` eine Funktion `canCheckIn(long datum)` aufrufbar sein. Die Implementierung ist aber abhängig von der Ticketart.
Ein Tagesticket kann nur an dem Tag der Gültigkeit genutzt werden. Ein Mehrtagesticket nur in dem Zeitraum. Ein Gesamtticket immer (der Einfachheit halber auch außerhalb der Festival Saison).
Es kann allerdings nie zur Laufzeit eine Instanz der Klasse `Ticket` erstellt werden. Nur Instanzen von erbenden Klassen sind erlaubt.

## Aufgabe 1 (15 min)

Laden sie die Klassen mit den vordefinerten Attributen herunter und stellen sie die Vererbungshierarchie sicher (Achten sie auch auf Konstruktorverkettung).

Implementieren sie nun auch die benötigte Logik für die Funktion `canCheckIn(long datum)`.


## Aufgabe 2 (10 min)

Im nächsten Schritt für das Buchungssystem müssen sie ihre Tickets speichern und prüfen können. 
Laden sie hierfür ebenfalls die vordefinierte Klasse `TicketChecker` herunter.

Diese Klasse wird dann später an der Kasse genutzt um ein Ticket (egal welcher Art) zu validieren. Initial werden der Klasse also alle Tickets übergeben.
Wählen sie hierfür eine Collection ihrer Wahl. Wichtig ist, dass Tickets nicht mehrfach in dieser vorkommen. Die Sortierung ist hierbei egal.

Implementieren sie nun die Funktion `checkTicket`, sodass zuerst geprüft wird, ob ein Ticket vorhanden ist. Und wenn es vorhanden ist, nutzen sie die im Ticket implementierte Funktion `canCheckIn` um zu überprüfen, ob das Ticket für den CheckIn genutzt werden kann.


## Aufgabe 3 (15 min)

Die Administratoren hätten noch gerne eine dedizierte Ansicht, in der sie sehen können, wie viele Tickets an welcher Kasse hinterlegt sind. 
Laden sie dafür auch zuerst die vordefinierte Klasse `TicketDashboard` herunter.

Ändern sie ihre `TicketChecker`-Klasse so ab, dass die foreach Schleife möglich wird. Ersetzen sie zudem das `?` mit dem richtigen Datentypen und implementieren sie den Rumpf der Foreach-Schleife, sodass die Anzahl der verschiedenen Ticket-Arten richtig gezählt wird.


## Aufgabe 4 (Zusatzaufgabe, 25 min)

Ihr Onkel hat als Rückmeldung bekommen, dass der Ansturm doch groß sein wird, da in Ingolstadt ja sonst nichts los ist und er Linkin Park und Tream für sich gewinnen konnte.

Seine Idee ist nun also mehrere Kassen zu bauen. Eine Kasse für jeden Tickettyp. Sie haben sich jetzt aber schon die Mühe gemacht und die `TicketChecker`-Klasse implementiert. Zu ihrem Glück können sie 
die Logik mit Hilfe von Generics spezifisch für die verschiedenen Ticketarten definieren. 

Parametrisieren sie die `TicketChecker`-Klasse nun also mit ihrem eigenen generischen Datentypen. Wichtig dabei ist, dass nur Klassen erlaubt sind, die von der `Ticket`-Klasse erben.