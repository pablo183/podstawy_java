import java.util.Scanner;

public class CustomScanner {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Jak sie nazywasz?");
        String name = scanner.nextLine();
        System.out.println("Siema " + name + " !!!");*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbne:");
        int firstNumber = scanner.nextInt();
        System.out.println("Twoja liczba to: " + firstNumber);
        int resutat = firstNumber*firstNumber;
//        System.out.println("Kwadrat Twojej liczby to: " + resutat);
        System.out.println("Kwadrat Twojej liczby to: " + firstNumber*firstNumber);


    }
}
