import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test = "Dies ist ein Beispiel";
        String[] ausgabe = test.split( "", 21);
        for (String y : ausgabe) {
            System.out.println(y);
        }
        //countletters(test, ausgabe);
    }
    //static int countletters (String test, String ausgabe String y) {}
}