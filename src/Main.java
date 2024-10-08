import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //Einlesen von Konsole
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gib den Rechnungsbetrag ein");
        String eingabeRechnung = scanner.nextLine();

        System.out.println("Wieviel Prozent Trinkgeld möchtest du geben (zb.10%)?:");
        String eingabeProzent =scanner.nextLine();

        System.out.println("Weiviele Personen waren beteiligt?:");
        String eingabePersonen = scanner.nextLine();

        //Verarbeiten von Eingaben
        float rechnung = Float.parseFloat(eingabeRechnung);
        int prozent = Integer.parseInt(eingabeProzent);
        int personen = Integer.parseInt(eingabePersonen);

        //Berechnen von Daten
        float trinkgeld =rechnung *(prozent /100f);
        float rechnungGes = rechnung + trinkgeld;
        float rechnungProPerson = rechnungGes/personen;

        //Ausgeben von Daten
        System.out.println("Ihr möchtet " + trinkgeld + " Trinkgeld geben.");
        System.out.println("Somit zahlt ihr " +  rechnungGes + "€.");
        System.out.println("Jeder von euch Zahlt" +rechnungProPerson + "€.");
    }

}

