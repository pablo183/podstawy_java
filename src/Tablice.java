public class Tablice {

    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Pawel";
        imiona[1] = "Julita";
        imiona[2] = "Marcin";

        System.out.println(imiona[0]);

        int[] lottoNumbers = new int[] {1,2,3,4,5,6};
        System.out.println(lottoNumbers[0]);

        System.out.println(lottoNumbers.length); // długosc tablicy

        // W petli
        System.out.println("1. Petla for");
        for (int i=0; i<imiona.length; i++ ) {
            System.out.println(imiona[i]);
        }
    }
}
