public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze mathTeacher");
        this.school = school;
    }

    public void teacgMatch() {
//        eat();
//        walk();
        System.out.println("I am teaching Match!");
    }

    public void sayHellow() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
        System.out.println("I am working " + school);
    }
}
