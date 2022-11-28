import java.util.Scanner;

public class OperatoryPorownaniaHomework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int a = scanner.nextInt();
        System.out.println("Twoja pierwsza liczba to: " + a);

        System.out.println("Podaj druga liczbe");
        int b =scanner.nextInt();
        System.out.println("Twoja druga liczba to: " + b);

        System.out.println("Wyniki");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

    }
}
