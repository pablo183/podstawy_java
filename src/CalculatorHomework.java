import java.util.Scanner;

public class CalculatorHomework {
    public static void main(String[] args) {

        System.out.println("Witaj w kalkulatorze");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();

        System.out.println("Podaj druga liczbe");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

//        int suma = calculator.add(firstNumber, secondNumber);
        int roznica = calculator.sub(firstNumber, secondNumber);
        int iloczyn = calculator.mult(firstNumber, secondNumber);
        int iloraz = calculator.div(firstNumber, secondNumber);
        int mod = calculator.mod(firstNumber, secondNumber);

        System.out.println("Suma =" + calculator.add(firstNumber, secondNumber));
        System.out.println("Roznica =" + roznica);
        System.out.println("Iloczyn =" + iloczyn);
        System.out.println("Iloraz =" + iloraz);
        System.out.println("Modulo =" + mod);


    }
}
