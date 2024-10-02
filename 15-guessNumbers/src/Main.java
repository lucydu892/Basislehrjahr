import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randNumber = random.nextInt(100);
        System.out.println("Die gesuchte Zahl ist zwischen 1...100");
        int guessNumber;
        boolean isGameOver = false;

        while (isGameOver == false) {
            System.out.println("Deine Zahl: ");
            guessNumber = scanner.nextInt();
            isGameOver = checkNumbers(randNumber, guessNumber);
        }
    }
    static Boolean checkNumbers(int randNumber, int guessNumber) {

        if (guessNumber == randNumber) {
            System.out.println("Richtig");
            return true;
        }
        if (guessNumber < randNumber) {
            System.out.println("Zu klein");
        }
        if (guessNumber > randNumber) {
            System.out.println("Zu gross");
        }

        return false;
    }
}