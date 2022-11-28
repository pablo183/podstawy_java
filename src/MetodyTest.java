public class MetodyTest {

    public static void main(String[] args) {
        Metody metody = new Metody();
//        metody.policzWynik();
//        int result = metody.pobierzWynik();
//        int result2 = result *2;
//        System.out.println("Wynik przed mnożeniem to: " + result);
//        System.out.println("Wynik po mnożeniu to: " + result2);

//        metody.policzWynikParam(2);
//        metody.policzWynikParam(100);
//        metody.policzWynikParam(23);

        int result =  metody.add(20,30, "Siema");
        System.out.println(metody.add(22, 33, "Siema2"));
        System.out.println(result);

    }
}
