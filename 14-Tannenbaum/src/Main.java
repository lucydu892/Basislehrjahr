import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Breite des Stammes ? ");
        int widthTribe = scanner.nextInt();
        System.out.println("Höhe des Stammes ? ");
        int heightTribe = scanner.nextInt();
        System.out.println("Höhe der Krone ? ");
        int heightCrown = scanner.nextInt();
        widthTribe(widthTribe);
    }
    static void widthTribe (int widthTribe) {
        if (widthTribe != 0){
            System.out.println("*");
        }
    }
    static void heightTribe (int heightTribe) {

    }
    static void heightCrown (int heightCrown) {

    }
}