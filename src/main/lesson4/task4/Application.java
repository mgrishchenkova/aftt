package main.lesson4.task4;

public class Application {
    public static void main(String[] args) {
        Human human = new Human();
        Passport passport = new Passport();
        String lastName = human.getLastName();
        String firstName=human.getLastName();
        String series = passport.getSeries();
        String number = passport.getNumber();

        passport.setSeries("1230");
        passport.setNumber("159159");


    }
}
