public class InkrementacjaDekrementacja {

    public static void main(String[] args) {
        //Inkrementacja zwiększenie wartości o jeden
        int a = 0;
        System.out.println("wartosc a: " + a);

        int b = a++;
        System.out.println("wartosc b: " + b);
        System.out.println("wartosc a: " + a);

        int c = ++a;
        System.out.println("wartosc c: " + c);
        System.out.println("wartosc a: " + a);

        //dekrementacja zmniejszenie wartości o jeden
        int d = 0;
        System.out.println("wartosc d: " + d);

        int e = d--;
        System.out.println("wartosc e: " + e);
        System.out.println("wartosc d: " + d);

        int f= --d;
        System.out.println("wartosc f: " + f);
        System.out.println("wartosc d: " + d);

    }
}
