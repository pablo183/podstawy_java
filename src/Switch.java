import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        System.out.println("Dzien dobry");
        Scanner scanner = new Scanner(System.in);
        System.out.println("pizza, losos, frytki");
        System.out.println("co podac:");
        String food = scanner.nextLine();


        switch (food) {
            case "pizza":
                System.out.println("cena to 11 zl");
                break;
            case "losos":
                System.out.println("cena to 22 zl");
                break;
            case "frytki":
                System.out.println("cena to 5 zl");
                break;
            default:
                System.out.println("zamow cos innego");


        }

    }
}
