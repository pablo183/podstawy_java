public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0f;

        int addition = firstNumber+secondNumber;
        int subtraction = firstNumber-secondNumber;
        int multiplication = firstNumber*secondNumber;
        float division = thirdNumber/secondNumber;
        int mod = secondNumber%firstNumber;


        System.out.println("Wynik dodawania " + addition);
        System.out.println("Wynik odejmowania " + subtraction);
        System.out.println("Wynik mnozenia " + multiplication);
        System.out.println("Wynik dzielenia " + division);
        System.out.println("Wynik modulo " + mod);

        firstNumber+=secondNumber;
        System.out.println("Po dodaniu " + firstNumber); //10
        firstNumber-=secondNumber;
        System.out.println("Po odjmowaniu " + firstNumber); //4
        firstNumber*=secondNumber;
        System.out.println("Po mnozeniu " + firstNumber); //24
        firstNumber/=secondNumber;
        System.out.println("Po dzieleniu " + firstNumber); //4
        firstNumber%=secondNumber;
        System.out.println("Po modulo " + firstNumber);
    }
}
