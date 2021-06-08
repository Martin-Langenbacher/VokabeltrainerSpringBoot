package de.telespring.vokabeltrainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VokabeltrainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VokabeltrainerApplication.class, args);
	}

}



/*
TODO:
 1) Auswertung vom Training: Vokabel richtig oder falsch
 2) Werte hochzählen, ...
 3) Ergebnis anzeigen...

 4) Verbesserung: Vokabelliste im Training auswählen --> Welche Vokabeln landen in der Trainingsliste (heute)

 5) Bekomme Auszeichnung
 6) if-s verbessern
 7) Verbindung von Trainings zu Auszeichnungen
 8) Einstellung: Wieviel Vokabeln pro Training

 9) Mogo-DB Umbau

 */




/*

Link Tipps (ältere Projekte):

1) Bookstore:
https://github.com/WCS-Java-Training-Bonn-2019/spring-bookstore/blob/master/src/main/resources/templates/book/get_all.html

2) SkillHub:
https://github.com/WCS-Java-Training-Bonn-2019/skill-hub/blob/master/src/main/resources/templates/users/get_by_skill.html

3) REST in Spring:
https://www.baeldung.com/spring-url-encoded-form-data

 */






/*

Tipps (von Jenny):

1) Stichpunkte:
* Definition driven architecture oder Design First API-Strategy:
--> Dann brauchst du keinen Code zu schreiben. Du generierst ihn aus den Definition files.
--> Die Definition Fieles waren früher für :
IPC nannte sich das IDL
RPC wurde dann XML genommen
WS haben WSDLs genutzt
googles RPC nutzt ProtoBuf definitions
und REST hat sich SWAGGER herauskristallisiert


* Swagger
* Auch JPA ist eher ein Dinosaurier. Man würde da eher Spring Cloud Data nutzen. Vor ALLEM, wenn das ganze in einem Container läuft.
* Gradle ist für Open Source und kleine Projekte für mal nebenbei oder Anderes super... Telekom mit allen Tests, Verifikationen, Abhängigkeiten, internen Bibliotheken usw ist da Maven praktischer.

2) ... angefangen habe ich mit make (https://en.wikipedia.org/wiki/Make_(software)), und dann weiter mit ANT (https://en.wikipedia.org/wiki/Apache_Ant) und
dann kam irgendwann Maven (https://maven.apache.org/), was defacto mit einem endlich gutem und einheitlichen Library Management daher kam und quasi Industrie
Standard wurde. Die Configs werden in XML geschrieben. Damals sind dann auch die ersten Build Environments entstanden, wie Hudson ( https://en.wikipedia.org/wiki/Hudson_(software) )-
heute Jenkins (https://www.jenkins.io/), aus denen sich dann mit gemeinsamem Projektmanagement als Idee moderne Dinge, wie Gitlab entwickelt haben...
Mit der Erfindung von der Programmiersprachen Variante Groovy (https://groovy-lang.org/) aus Java wurde dann die Idee geboren "schreibe weniger, mache mehr" und
so entstand gradle (https://gradle.org/) als low-carb Variante von Maven.



 */