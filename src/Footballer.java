public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        System.out.println("Jestem w konstruktorze footballer");
        this.footballClub = footballClub;
    }

    public void palayFootbal() {
//        eat();
//        walk();
//        System.out.println("Hello my name is " + name);
//        System.out.println("I am " + age);
        System.out.println("I am playing footbal for" + footballClub);
    }

}
