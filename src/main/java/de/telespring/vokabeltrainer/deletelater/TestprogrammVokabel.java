package de.telespring.vokabeltrainer.deletelater;

import java.util.ArrayList;

public class TestprogrammVokabel {
}


/*
package de.martin.vokabel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestprogrammVokabel {

    public static void main(String[] args) {
        System.out.println("===>   Test-Starts!   ===>");

        // 1. Comparator Implementation:
        class Indexvergleich implements Comparator <Vokabel> {
            public int compare(Vokabel eins, Vokabel zwei) {
                return eins.getKnowledgeIndex() - zwei.getKnowledgeIndex();
            }
        }


        /*
        // 1. Comparator Implementation...
	class Namensvergleich implements Comparator <Berg> {
		public int compare(Berg eins, Berg zwei) {
			return eins.name.compareTo(zwei.name);
		}
	}

	// 2. Comparator Implementation...
	class Höhenvergleich implements Comparator <Berg> {
		public int compare(Berg eins, Berg zwei) {
			return (zwei.höhe - eins.höhe);
		}
	}


    ArrayList<Vokabel> vokabeln = new ArrayList<>();
    ArrayList<Vokabel> vokabeln2 = new ArrayList<>();



    Vokabel vok1 = new Vokabel(1l, "Haus", "house", "Bemerkung!");
    Vokabel vok2 = new Vokabel(2l, "Hemd", "shirt", "Bemerkung!");
    Vokabel vok3 = new Vokabel(3l, "Stift", "pen", "Bemerkung!");
    Vokabel vok4 = new Vokabel(4l, "Fenster", "window", "Bemerkung!");
    Vokabel vok5 = new Vokabel(5l, "Freund", "friend", "Bemerkung!");

        vokabeln.add(vok1);
                vokabeln.add(vok2);
                vokabeln.add(vok3);
                vokabeln.add(vok4);
                vokabeln.add(vok5);

                for (Vokabel vokabel : vokabeln ) {
                System.out.println(vokabel.toString());
                }


                System.out.println("<============================================= Test-Liste 1!   <===");
                vokabeln2 = vokabeln;
                for (Vokabel vokabel : vokabeln2 ) {
                System.out.println(vokabel.toString());
                }

                // Werte füllen
                for (int i = 0; i < vokabeln2.size(); i++) {
        vokabeln2.get(i).setKnowledgeInPercent(zufallszahlMethode(0, 100));
        vokabeln2.get(i).setRightInARow(zufallszahlMethode(0, 6));
        vokabeln2.get(i).setWronglyAnswered(zufallszahlMethode(0, 6));
        vokabeln2.get(i).setAmountOfTests(zufallszahlMethode(2, 12));

        // Index berechnen:
        double rightInARowNumber = vokabeln2.get(i).getRightInARow();
        if (rightInARowNumber <= 0) {
        rightInARowNumber = 1;
        }
        double doubleWronglyAnswered = vokabeln2.get(i).getWronglyAnswered();
        if (doubleWronglyAnswered <= 0) {
        doubleWronglyAnswered = 1;
        }
        double doubleAmountOfTests = vokabeln2.get(i).getAmountOfTests();
        if (doubleAmountOfTests < 0) {
        doubleAmountOfTests = 1;
        }

        //double doubleIndexBerechung = 55.5d;
        double doubleIndexBerechung = (101 - vokabeln2.get(i).getKnowledgeInPercent()) * (1 / rightInARowNumber) * doubleWronglyAnswered * (1 / doubleAmountOfTests);

        System.out.println(101 - vokabeln2.get(i).getKnowledgeInPercent());
        System.out.println(1 / rightInARowNumber);
        System.out.println(doubleWronglyAnswered);
        System.out.println(1/ doubleAmountOfTests);







        int indexBerechung = (int) doubleIndexBerechung;
        System.out.println("indexBerechnung: " + indexBerechung);
        System.out.println("Double: " + doubleIndexBerechung);
        vokabeln2.get(i).setKnowledgeIndex(indexBerechung);
        //vokabeln2.get(i).setKnowledgeIndex(zufallszahlMethode(100, 600));
        }





        Indexvergleich indexvergleich = new Indexvergleich();
        Collections.sort(vokabeln2, indexvergleich);
        System.out.println();

        for (Vokabel vokabel : vokabeln2 ) {
        System.out.println(vokabel.toString());
        }
        System.out.println("<============================================= Test-Ende!");
        }


private static int zufallszahlMethode(int min, int max) {
        int zahl = (int) ((Math.random() * (max - min+1)) + min);
        return zahl;
        }
        }






        */