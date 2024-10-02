import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randNumber = random.nextInt(100);
        System.out.println(randNumber);
        System.out.println("Die gesuchte Zahl ist zwischen 1...100");
        int guessNumber = scanner.nextInt();
        checkNumbers(randNumber, guessNumber);

    }
    static void checkNumbers (int randNumber, int guessNumber) {
        if (guessNumber == randNumber) {
            System.out.println("Richtig");
        } if (guessNumber < randNumber){
            System.out.println("Zu klein");
        } if (guessNumber > randNumber) {
            System.out.println("Zu gross");
        } else {
            System.out.println();
        }
    }
}