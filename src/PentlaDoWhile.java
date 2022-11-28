import java.util.Scanner;

public class PentlaDoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int abc = scanner.nextInt();
        do {
            System.out.println("wartosc to: " + abc + ", ktora jest mniejsza od 20");
            abc++;
        }
        while (abc < 20);
    }
}
// jeżeli podamy licze wieksza "abc" najpierw zostanie wydrukowany blok do, później zostanie sprawdzone "while"
