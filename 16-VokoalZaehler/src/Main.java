import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ich rechne dir die Anzahl der Buchstaben und wie viele Vokale vorkommen.");
        System.out.println("Schreibe nun ein Wort oder ein Satz: ");
        String sentance = scanner.nextLine();
        int length = sentance.length();
        countletters(sentance);
        countVocals(length);
    }
    static int countletters (String sentance) {
        int length = 0;
        for (int i = length; i < sentance.length(); i ++ ) {
            if (sentance.charAt(i) != ' ') {
                length++;
                }
        }
        System.out.println("Dein Satz oder Wort besteht aus " + length + " Buchstaben");
        return length;
    }
    static void countVocals (int length) {
        System.out.println(length);
    }
}