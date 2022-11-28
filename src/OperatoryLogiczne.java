public class OperatoryLogiczne {
    public static void main(String[] args) {

/*        boolean firstValue = true;
        boolean secendValue = false;
        boolean thiredValue = false;
        boolean fourValue = true;*/

        boolean firstValue = 2 > 1;
        boolean secendValue = 2 < 1;
        boolean thiredValue = false;
        boolean fourValue = true;

        //&& -> Koniunkcja true wtedy gdy dwa wyrazenia składowe sa rowne true
        System.out.println(firstValue && secendValue); //false
        System.out.println(firstValue && fourValue); // true

        // || lub -> true gdy jedno wyrażenie składowe jest rowne true
        System.out.println(firstValue || secendValue);
        System.out.println(secendValue || thiredValue);

        // ! negacja -> zwraca wartość przeciwną do wyrażenia przed którym się znajduje
        System.out.println(!firstValue);
        System.out.println(!secendValue);
        System.out.println(!(firstValue&&secendValue));

    }
}
