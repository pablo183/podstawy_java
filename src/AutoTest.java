public class AutoTest {

    public static void main(String[] args) {
        Auto mercedes = new Auto( "Mercedes", "Klasa S", 2021 , 1000);
        mercedes.marka = "Mercedes";

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto("Audi","A5", 2020, 0);
        audi.marka = "Audi";
//        audi.model = "A5";
//        audi.rok = 2020;
//        audi.przebieg = 0;

        audi.jedz();
        audi.hamuj();
        audi.info();

        Auto noName = new Auto();

        noName.jedz();
        noName.hamuj();
        noName.info();



    }
}