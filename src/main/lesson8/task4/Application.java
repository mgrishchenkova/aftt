package main.lesson8.task4;

public class Application {
    public static void main(String[] args) {
        Entity user = new User("Иванов Петр", "Программист");
        user.validate();
        Entity user2 = new User("Иванов Петр", "Программист");
        user2.validate();
    }
}
