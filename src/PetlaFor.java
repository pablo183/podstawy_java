import java.util.Scanner;

public class PetlaFor {
    public static void main(String[] args) {


        // Zad 1
        System.out.println("zadanie 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int number = scanner.nextInt();
        int numer = number;
        for (int i = 0; i <= numer; i = i +2) {
            System.out.println(i);
        }
        // Zad 2
        System.out.println("zadanie 2");
        for (int i = 0; i <= number; i++) {
            if(i%5==0) {
                System.out.println(i);
            }
        }
        // zad 3
        System.out.println("zadanie 3");
        for (int i = 0; i < number; i++ ) {
            System.out.println("bede robil prace domowe");
        }



    }
}
