import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TO DO:

        System.out.println("Introduceti un numar natural pozitiv:");
        int n = scanner.nextInt();
        while (n >= 0) {
            System.out.println("Dublul sau este: " + (n * 2));
            System.out.println("Introduceti un numar natural pozitiv:");
            n = scanner.nextInt();
        }
        System.out.println("La revedere!");
    }
}
