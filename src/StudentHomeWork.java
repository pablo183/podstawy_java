import java.util.Scanner;

public class StudentHomeWork {

    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
        Student.infoUczelnia();


        Student julita = new Student();
        julita.imie = "Julita";
        julita.nazwisko = "Rajewska";
        julita.numerID = 123123;
        julita.email = "s.rajewska@gmail.com";
        julita.nick = "s.rajewska";
        String uczelniajulity = julita.nazwaUczelni;
        // julita.infoUczelnia();

        Student pawel = new Student();
        pawel.imie = "Pawel";
        pawel.nazwisko = "Sokolski";
        pawel.numerID = 123456;
        pawel.email = "p.sokolski@gmail.com";
        pawel.nick = "p.sokolski";

        Student kasia = new Student();
        kasia.imie = "Kasia";
        kasia.nazwisko = "Turek";
        kasia.numerID = 111111;
        kasia.email = "k.turek@gmail.com";
        kasia.nick = "k.turek";

        Student[] students = new Student[3];
        students[0] = julita;
        students[1] = pawel;
        students[2] = kasia;

        for (int i = 0; i < students.length; i++) {
            students[i].nazywamSie();
            students[i].nick();
            students[i].numerID();
            students[i].email();

        }

        String imie = "Pawel";
        Scanner scanner = new Scanner(System.in);
    }
}
