import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib ein Geburstdatum ein: ");
        String dateOfBirth = "19,09,1971";
        splitString(dateOfBirth);
    }
    static String[]splitString (String dateOfBirth) {
        String [] splited = dateOfBirth.split(",",3);
        for (String y : splited) {
            System.out.println(y);
        }
        return splited;
    }
}