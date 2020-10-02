package main.lesson4.task1;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Application {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws ParseException {
        Human human = new Human();
        String lastName = human.getLastName();
        String firstName = human.getFirstName();
        Date birthDate = human.getBirthDate();

        human.setLastName("Сидоров");
        human.setLastName("СИдоров");
        human.setLastName("СидОров");
        human.setLastName("СидироВ");
        human.setLastName("сидоров");
        human.setLastName("Cидоров");
        human.setLastName("");

        human.setFirstName("Иван");
        human.setFirstName("Iван");
        human.setFirstName("Иванушкаиванушкаивашушкиванушкаиванушкаиванушкаиван");
        human.setFirstName("иван");
        human.setFirstName("");


        human.setBirthDate(sdf.parse("02.01.2020"));
        String today = sdf.format(new Date());
        human.setBirthDate(sdf.parse(today));
        String tomorrow = sdf.format(new Date(new Date().getTime() + 86_400_000L));
        human.setBirthDate(sdf.parse(tomorrow));
        human.setBirthDate(sdf.parse("05.10.2020"));


    }

}

