package main.lesson3.task4;

public class Application {
    public static void main(String[] args) {
        Human sergey = new Human("Сергей");
        Human valeriy = new Human("Валерий");
        Human mikhail = new Human("Михаил");
        Human stanislav = new Human("Станислав");
        Human egor = new Human("Егор");
        Human grigoriy = new Human("Григорий");
        Human alexander = new Human("Александр");

        sergey.addfriends(valeriy);
        sergey.addfriends(grigoriy);
        stanislav.addfriends(valeriy);
        stanislav.addfriends(mikhail);
        egor.addfriends(alexander);
        egor.addfriends(grigoriy);
        alexander.addfriends(grigoriy);
        alexander.addfriends(mikhail);

        System.out.println(proverka(sergey, grigoriy));
        System.out.println(proverka(sergey, alexander));
        System.out.println(proverka(stanislav, mikhail));
        System.out.println(proverka(mikhail, valeriy));
    }

    static boolean proverka(Human first, Human second) {
        for (Human firstFriend : first.friends)
            if (firstFriend == second) return true;
        return false;
    }
}
