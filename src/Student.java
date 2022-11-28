public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public Integer numerID;
    public static String nazwaUczelni = "AGH po zmianie";


    public void elektronicznySystem() {
        System.out.println("Jest to elektroniczny system Twojej Uczelni");
    }

    public void przywitanieSie() {
        System.out.println("Informacje:");
    }
    public void podajNumerID() {

    }

    public void nazywamSie() {
        System.out.println("Nazywasz sie " + imie + " " + nazwisko);
    }
    public void nick() {
        System.out.println("Loguj sie za pomoca: " + nick);
    }
    public void numerID() {
        System.out.println("Moj nr indeksu to: " + numerID);
    }
    public void email() {
        System.out.println("Moj adres email to: " + email);
    }

    public static void infoUczelnia() {

        System.out.println("Moja uczelnia to " + nazwaUczelni);
        druga();
    }

    public static void druga() {
        System.out.println("Jestem drugą metosą");
    }






}
