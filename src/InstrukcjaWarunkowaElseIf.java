import java.util.Scanner;

public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbne:");
        int a = scanner.nextInt();

        if (a == 0) {
            System.out.println("Twoja liczba to " + a + ". Liczba jest rowna zero");
        } else if (a > 0) {
            System.out.println("Twoja liczba to " + a + ". Liczba jest dodania");
        }else if (a > 10) {
            System.out.println("Twoja liczba to " + a + ". Liczba jest dodatnia i większa niż 10");
        } else if (a < -10) {
            System.out.println("Twoja liczba to " + a + ". Liczba jest ujemna");
        } else {
            System.out.println("Twoja liczba to " + a + ". Zaden warunek nie zostal spelniony");
        }

    }
}
