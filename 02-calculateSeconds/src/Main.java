import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Berechnung von Sekunden eines Monats in Abhängigkeit seiner Anzahl Tage");
            System.out.println("Wie viele Tag hat der Monat, für den Sie die Sekundenzahl berechnen wollen?");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String input = in.readLine();
            int days = Integer.parseInt(input);

            if (days > 28); {
                System.out.println("Gib eine Zahl zwischen 28 und 31 Tagen ein.");
            }
            if (days < 32); {
                System.out.println("Gib eine Zahl zwischen 28 und 31 Tagen ein.");
            }
            System.out.println("Ihre Eingabe " + (days) + " ist gültig.");
            int seconds = days * 24 * 60 * 60;
            System.out.println("Ein Monat mit " + days + " Tagen" + " hat " + seconds);
        } catch (NumberFormatException ex) {
            System.out.println("Eingabefehler. Bitte geben Sie eine Zahl ein.");
        } catch (Exception ex) {
            System.out.println("Unbekannter Fehler: " + ex.toString());
        }
    }
}