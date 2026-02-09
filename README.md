# java-datengrab

Willkommen im zentralen Repository für unsere Java-Übungen! Hier sammeln wir unsere Lösungen, um Code-Stile zu vergleichen und uns auf die Klausur vorzubereiten.

📂 Die Repo-Struktur (Wichtig!)Wir nutzen eine nutzerzentrierte Struktur, damit jeder sein eigenes IDE-Projekt (VS Code / IntelliJ) verwalten kann, ohne die anderen zu stören.
Struktur: [Name] / DHBW-Programmieren / src / [Package-Pfad] / [Klasse].java 

Beispiel:Name/DHBW-Programmieren/src/de/dhbwka/java/exercise/datatypes/ShortValue.java

📜 Unsere "Goldenen Regeln"
Jeder in seinem Revier: Arbeite nur in deinem eigenen Namens-Ordner.
Package-Disziplin: Halte dich strikt an die Package-Vorgaben der Aufgabenblätter (z.B. de.dhbwka.java.exercise.datatypes).
Kommentare helfen: Wenn eine Aufgabe eine Verständnisfrage stellt (z.B. "Warum kommt hier -32768 raus?"), schreibe die Antwort als Kommentar in deinen Code.

Pull vor Push: Bevor du deine Änderungen hochlädst, mache immer ein git pull.

🛠 Workflow für Teilnehmer (VS Code & Terminal)
1. Projekt lokal einrichtenÖffne VS Code im Ordner [DeinName]/DHBW-Programmieren. Stelle sicher, dass der src-Ordner als Java-Source-Pfad erkannt wird.
2. Neue Aufgabe hinzufügenErstelle das entsprechende Package unter src und füge deine .java Datei hinzu.
3. Änderungen hochladenÖffne das Terminal im Hauptverzeichnis des Repos:Bash# 1. Stand der anderen abrufen
git pull

# 2. Deinen Ordner hinzufügen
git add [DeinName]/

# 3. Bestätigen (Commit)
git commit -m "[DeinName]: Aufgabe [Klassenname] hinzugefügt"

# 4. Hochladen
git push origin main
📖 Aufgaben-Index (Quick Links)Hier können wir Links zu besonders interessanten Lösungen sammeln:BereichAufgabeFokus-ThemaPackagesHelloWorldProjekt-Setup & OutputDatatypesShortValueInteger Overflow & 2er-Komplement
