package main.lesson8.task1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            listPerson.add(new Person());
        }

//дописать дедубликацию
    }
}
