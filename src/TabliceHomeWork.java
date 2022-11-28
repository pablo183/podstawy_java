import java.util.Scanner;

public class TabliceHomeWork {

    public static void main(String[] args) {

        System.out.println("zadanie 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }


        System.out.println("");
        System.out.println("zadanie 2");
        int[] numbers = new int[] {1,3,5,7,0,8};

        for (int j=0; j<(numbers.length/2); j++) {
            int temp = numbers[j]; //dla j=0 element bedzie mial wartosc 1, dla j=1 wartość =3,
            numbers[j] = numbers[numbers.length-1-j]; // odejmujemy 1 bo numerujemy od 0. Musimy odjac j - dla pierwszej interakcji j = 0
            numbers[numbers.length-1-j] = temp; //temp=1
        }
        for (int j=0; j<numbers.length; j++) {
            System.out.println(numbers[j]);
        }
    }
}

