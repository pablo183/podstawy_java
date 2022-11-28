import java.util.Scanner;

public class AgeStore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w naszym sklepie. Ile masz lat?");
        int a = scanner.nextInt();

        if (a < 18 && a > 0 ) {
            System.out.println("Dorosnij ZIOM u nas nic nie kupisz");
        } else if (a >= 18) {
            System.out.println("Zapraszamy do zakupow byczku");
        } else {
            System.out.println("Jeszcze sie nie urodziles? Nie sciemniaj");
        }

    }
}
