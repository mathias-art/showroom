package net.javaguides.sms;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

//import net.javaguides.sms.entity.Student;
//import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication

@EnableJpaRepositories(basePackages="net.javaguides.sms") // Kopie aus: https://coderanch.com/t/718817/frameworks/Service-required-bean-type
                                                          // Montag, 21.02.2022 (Mathias Hüther)

public class StudentManagementSystemApplication implements CommandLineRunner { 
	
	// nach Video https://www.youtube.com/watch?v=slTUtTSwRKU&list=PLGRDMO4rOGcNSBOJOlrgQqGpIgo6_VZgR 
	                                              // ab ca. 3:45:00 // bis 3:55:00 gekommen (Montag, 17.01.2022, 15 Uhr 48)!
	                                              // bis 4:00:00 gekommen (Montag, 17.01.2022, 16 Uhr 36)
	                                              // bis 4:05:30 gekommen (Montag, 17.01.2022, 17 Uhr 10)
	                                              // bis 4:27:00 gekommen (Montag, 17.01.2022, 21 Uhr 49)
	                                              // bis 4:40:22 gekommen (Dienstag, 18.01.2022, 9 Uhr 17)
	                                              // bis 4:50:00 gekommen (Dienstag, 18.01.2022, 11 Uhr 47)
	                                              // abgeschlossen (5:10:51) (Dienstag, 18.01.2022, 14 Uhr 27)
	
	// templates: Students.xml: im Original als "Students.html" - HTML-, statt wie hier, XML-Datei!
	// als Students.xml gibt es nur Fehlermeldungen! - später entsprechende HTML_Datei importieren oder einbinden (reine Textdatei geht nicht!)!
	// auch mit templates als resources-folder (mit Hochladen der html-Dateien) gibt es viele Springboot-Fehlermeldungen (Mittwoch, 19.01.2022, 11 Uhr)
	// Lösungen: Suche nach Möglichkeiten, html-Dateien in dieser Eclipse-Fassung direkt einzubinden - war erfolgreich
	//           (Mittwoch, 19.01.2022, 13 Uhr 21);
	//           Download der entsprechenden Bootstrap- (plugins/) Dateien (ist dem so? - nein, alle notwendigen plugins sind in den html-Dateien enthalten und aktiv)
	// Alle bestehenden Fehler bleiben: Springboot läuft an, stockt und bricht ab. Es folgen viele Fehlermeldungen! (Mittwoch, 19.01.2022, 13 Uhr 36)
    // Fehler durch Bhim behoben dank passenden Textteilen (dependencies in pom.xml und Modifikationen in application.properties (Mi, 19.01.2022, 15 Uhr)
	// Alle Funktionen erklären - wie läuft der Code ab - was geschieht wo? create (read) update delete - für Donnerstag (20.01.2022)!!!
	// "Gute Erklärung des Codes und seiner Bestandteile und Wirkungsweisen!" (großes Lob von Bhim!) (Donnerstag (20.01.2022))
	// Aufgaben für Freitag, 21.01.2022:
	//One more column "branch" in table and update.  After  "Email".  Change in html(-Deocuments) and change in Java-Code (Student, StudentController). 
    //Add one more column after "branch" : "semester". Add radio-button in "semester".
    //Enter "semester" (Number) in "semester" (column). (hat funktioniert, auch mit "semester" als int im Java Code (Freitag, 21.01.2022)
	
	//Aufgabe für Montag: in Anzeige (via localhost) "firstName" (Eintrag, z.B.: "Heinrich"): link:
	//FirstName as a link --> new page: marks for each semester : Table: Name first sem, second_sem,third_sem, fourth_sem (Marks as numbers)
   //"Student_Marks" - separate table; connect both tables using "join" - joining two tables: having one and than viewing a second one:
	// possibly by using methods like these: https://social.msdn.microsoft.com/Forums/en-US/42556540-bc0c-4a75-8101-23f77056d022/how-make-a-database-bound-bootstrap-table-column-act-as-an-hiperlink-to-another-view?forum=aspmvc
	// e.g.: taking the name of the second table as a reference using "join"
	// weitermachen, nach kurzer Besprechung (samt Hinweis zur Lösung), am Dienstag (25.01.2022)
	// Dienstag, 25.01.2022: Aufbau der Packages, Classes und HTML-Dokuments beendet - als Springboot App lauffähig
	// NULLPOINTEREXEPTION (NPE) nach Eingabe der URL via localhost (bei "student_marks"); 
	// mögliche Lösung via "Optional" (seit Java 8) (Stackoverflow Website) oder per Lambda (immer mit einer neuen RessourceNotFound-Klasse in eigenem Package)
	// (Mittwoch, 26.01.2022) (Mathias Hüther)
	// Rücksprache mit Bhim: alle Klassen der Art "StudentMarks." lassen sich in die entsprechenden Klassen der Art "Student." integrieren
	// (Effekt: Vereinfachung der Aufbaustruktur des Gesamtprojekts (weniger Packages!) (Mittwoch, 26.01.2022, 13 Uhr 36)
	// Code weitgehend zusammengeführt und angepasst (Es bleiben Fragen.) (Mittwoch, 26.01.2022, 15 Uhr 51)
	// Null-Verweis entsteht; Hinweis auf Anwendung einer Java-Bean (Donnerstag, 27.01.2022, 10 Uhr 52)

	// Tabelle "student_marks" bauen und dann weitermachen! (Bhim, 28.01.2022 (Freitag))
	// für Dienstag: Recherche (und Code einfügen in Template!): Wie übergibt (submit) radiobutton Werte an Edit bzw. UI?
	// Text Form (text zum ausfüllen) für semester (Form füllen und Verbindung zu "Student" herstellen!
	// Templates: inside a form (change text, do not introduce another form inside a form!)
	// Radio-Button: Bsp.: Car durch student ersetzen! --> Bsp.: frontbackend (im Web)--> text--> student semester! 
	// Connection to Java via "th: field="*{semester}" (field in class "student")(für Mittwoch, 02.02.2022)
	// Eingabe Textfeld-Lösung funktioniert (nur für das update, nicht für "delete" und "add student" (Mittwoch, 02.02.2022, 9 Uhr 37 (Mathias Hüther))
	// nun geht es auch für "delete" (Mittwoch, 02.02.2022, 9 Uhr 54 (Mathias Hüther))
	// Eingabe "nullable = false" in html-files bei "semester" ? zur Abwendung des Fehlers und Zählen der Semester ab "1" (nicht ab "0")
	// (Mittowch, 02.02.2022, 11 Uhr 44 (Mathias Hüther))
	// Eingabe der default-Werte "first_sem" - händisch via MySQL Workbench - alter table (bei students) dann auf "0" (für alle Semester als default) setzen!
	
	// für Donnerstag (03.02.2022):
	// "first-sem" - studentMarks vergeben via templates (analog zur Arbeit am Mittwoch) - schöner Scheitern
	// Debug the project/ Java Code
	//Donnerstag (03.02.2022) : Video zu Debugging angesehen und wenig verstanden - Bhim (Kurzanleitung) (falsch erinnert! - Video erneut ansehen!):
	//Projekt (MAIN-Class öffnen) - Debug (Ant-Symbol), Brekpoints in Nebenklassen (StudentController etc.) setzen, Browser öffnen, Werte ändern,
	//dann ab dem Breakpint debuggen (niemals: "Skipp all breakpoints" auswählen (disables all breakpoints)!!!!) (für Freitag: debuggen!!!)
	
	// Freitag, 04.02.2022, ab 8 Uhr 30 bis 12 Uhr
	
	// laut Video: Java EE öffnen, Programm auswählen (Main-Class), Debug on Server wählen, Autor wählt Tomcat-Server, Programm startet im Debug Mode
	// (mit Anzeige in der Konsole), Autor öffnet Server (localhost...) und gibt Daten ein (schickt diese mit "submit" ab), Autor geht zurück in
	// Eclipse und via Breakpoint hinein in die entsprechende Methode der entsprechenden Klasse, getestete Aktion wird via F8 (Resume(?)) im
	// Debug-Mode (in Eclipse ausgeführt) und erscheint danach als ausgeführt im Browser, Anzeige via "GetAllBooks" erfolgt im Browser (Check in der
	// Methode im Debug-Mode(Eclipse) vorab) --> gedebuggtes Buch erscheint noch nicht in der Anzeige, Autor geht in Eclipse in entsprechende Methode
	// und sieht sie sich an, Anzeigen in der Konsole zu ausgeführten Aktionen in Hibernate: Kopieren und in Database (Datenbank) einfügen, 
	// im Datenbankprogramm (Oracle SQL Developper): Anzeigen als Query einfügen und ausführen lassen, Autor aktiviert im Code "set active SW", um
	// das via Debug erschaffene Buch in die Datenbank einzuführen (Autor kommentiert die entsprechende Zeile im Code ein!), 
	// dann erneute Ausführung via Debug on Server, Eingabe neuer Buchdaten (eines neuen Buches) im Browser-Formular, (entsprechende Einstellungen
	// in Debug-Mode:) Buch erscheint nun im Browser als neues Buch.
	// Video: Java Debugging Tutorial For Beginners| Ashok IT
	// 23,524 viewsOct 18, 2018
	// https://www.youtube.com/watch?v=2WxsClYhreE
	// Eine super Idee, die aber bei mir natürlich so nicht funktioniert!
	
	// Meine Ausführung: mittels Debug as Java -Application mit Browser (Localhost...) verhindert das Laden der entsprechenden Browser-Seite.
	// (Anmerkung des Browser: "can't reach this page!")
	// Ein Start mittels Debug via Server geht angeblich nicht! - neues Video ansehen, in dem "mein" Weg vorgestellt wird!
	
	// neues Video:Eclipse Debugging | by Mr. Raghu
	// 33,715 viewsSep 19, 2020
	// https://www.youtube.com/watch?v=HwwF4pvYWws
	// darin: Hinweis: Resume (Pfeil(im Debug-Mode)) = Stop [F8]:
	// To finish current execution also used for next nearest breakpoint
	// (= breakpoint following the last visited breakpoint in the code)
	// Sprung von einem breakpoint in die entsprechende Methode 
	// anderer Breakpoint (nach Java-Code-ABLAUF); 
	// Breakpoints werden daher nicht von oben nach unten abgearbeitet sondern gemäß der Java-Ablauf-Logik!!!
	// auch Java-Workflow /-Execution-Flow genannt!
	// Zitat: "If project has no breakpoints then debug also behaves like run."
    // ab Minute 47:37 (gesamt:55:54): Mr. Raghu spricht über Springboot Project; geht dann aber über Springboot Einstellung auf Debug via Server
	
	// Debug: Debug on Server als Eingangsoption in Eclipse (Mathias Hüther (Freitag, 04.02.2022, 13 Uhr 34)
	// Einstieg: Main Class öffnen, Debug as Java Application, Browser öffnen (localhost://8080/students/new), neue Person anlegen, submit
	// Einstieg in Debug via Breakpoints im StudentController (Code durchleuchten!) (Mathias Hüther (Freitag, 04.02.2022, 13 Uhr 51))
	// Fehlermeldung (bug) hinterher in MySQL WorkBench bei bleibendem Eintrag aus Debug-Mode (Mathias Hüther (Freitag, 04.02.2022, 14 Uhr 02))
	
	// Warnhinweise wegen anderer Art des Debuggings (...as Java Application) betr. Code-Debugging vs. Code-Ausführung (normal)
	// Änderungen mittels localhost://8080/students/new lassen sich als dauerhafte Änderungen in der Datenbank aus- und durchführen
	// (ohne Fehldermeldungen in der SQL Workbench und der Konsolenanzeige in Eclipse)
	// Videos zum Debugging bei Springboot mittels Eclipse bis einschließlich Trefferseite 12 durchgesehen
	// und wenige, m.E. zutreffende, Videos angesehen und zu Favoriten hinzugefügt (Mathias Hüther (Montag, 14.02.2022, 11 Uhr 34))
	// Debugging via Server geht nicht von der Main Klasse aus, da keine entsprechenden Resourcen darin enthalten sind (s. Warnhinweis)
	// (Mathias Hüther (Montag, 14.02.2022, 11 Uhr 42))
	// Debug as (a) Java Application, danach: localhost://8080/students (per Browser); dann Einzeleinstieg in die Debug-Ausgabe (links oben);
	// "Durchsteppen" der einzelnen Konzepte ("ArrayasList" etc.) und einzelner Stellen im Code selbst; abschließende (richtige) Anzeige im
	// Browser zeigt die aktuelle Student-List (Mathias Hüther (Montag, 14.02.2022, 14 Uhr 07))
	
	// Debug: immer neu breakpoints setzen, dann debuggen. Nur die Klassen debuggen (mit Step into und step over), die ich geschrieben habe,
	// nicht die Klassen, die mir Eclipse fertig anbietet.
	// Reduktion der calls mit Bhim auf 2 oder 3 pro Woche. Aufgaben bis Mi: Debuggen von Klassen, Methoden,... / Bhim zeigen!
	// (Mathias Hüther (Montag, 14.02.2022, 15 Uhr 18))
	
	// Einzelbreakpoint bei "create" geht, ebenso bei listStudents
    // beide Breakpoints zusammen gehen nicht beim Debuggen
    // Breakpoints können nicht in interfaces gesetzt werden (Mathias Hüther (15.02.2022, 13 Uhr 40))
	
	// Debugging lief gut in der Vorführung (Bhim war hinreichend zufrieden damit) (Mathias Hüther (Donnerstag, 17.02.2022, 14 Uhr 45))
	
	// to do for monday: connecting two tables and create another table and connect it to the existing table (Do, 17.02.2022)
	
	// How to map one column from one table to another table in another table? (für Di, 22.02.2022) - google it - Fehler 1, 2, 3...
	// Erst mittels Link Artikel in Baeldung zur Tabellenzusammenführung lesen, dann verstehen und auf mein Beispiel anwenden.
	// Weitere Artikel hinzuziehen! 
	// new project with two tables mapping dependencies and run (für do)!
	// Projekt am 23.02.2022 (Donnerstag) abgeschlossen - läuft nur mit der Ausgangstabelle "students" bei entsprechender Auskommentierung!

	
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
    
//	@Autowired
//	private StudentRepository studentRepository;
//	
//	@Bean
	//public entityManagerFactory 
	
	//@org.springframework.beans.factory.annotation.Autowired(required=true)
	
	//@Primary // kopiert aus: https://github.com/spring-guides/gs-accessing-data-mysql/issues/10
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("tony", "stark", "tony@gmail.com");
//		studentRepository.save(student3);
		
	}
//	@Bean //(name=“entityManagerFactory”) // Kopie aus: https://discourse.hibernate.org/t/error-creating-bean-with-name-entitymanagerfactory-defined-in-class-path-resource/4675
//	public LocalSessionFactoryBean sessionFactory() {                       // Montag, 21.02.2022 (Mathias Hüther)
//	LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//	return sessionFactory;
//	}
	
	// @EnableJpaRepositories(basePackages="sam.springboot.dao")

}
