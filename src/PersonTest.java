public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Paweł", 29, "UwB");
//        teacher.name = "Pawel";
//        teacher.age = 39;
//        teacher.school = "UwB";
        teacher.walk();
        teacher.eat();
        teacher.teacgMatch();
        teacher.sayHellow();

        Footballer footballer = new Footballer("Marcin", 29, "Jagiellonia");
//        footballer.name = "Marcin";
//        footballer.age = 29;
//        footballer.footballClub = "Jagiellonia";
        footballer.walk();
        footballer.eat();
        footballer.palayFootbal();
    }
}
