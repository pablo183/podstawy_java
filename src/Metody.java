public class Metody {

    public void policzWynik() {
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i=0; i <100; i++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);

    }
    public int pobierzWynik() {
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
        return result;
    }

    public void policzWynikParam(int number) {

        System.out.println("Namber ma wartosc :" + number);
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
    }


    public int add (int i, int i1, String word) {
//        System.out.println("Suma to: " + (i+i1));
        System.out.println(word);
        return i + i1;
    }
}
