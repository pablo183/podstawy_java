import java.util.Scanner;

public class PetlaWhile {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int abc = scanner.nextInt();
        while (abc < 20) {
            System.out.println("wartosc to: " + abc + ", ktora jest mniejsza od 20");
            abc++;

            }


        }

    }

