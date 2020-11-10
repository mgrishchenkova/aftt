package main.lesson8.task1;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            listPerson.add(new Person());
        }

//дописать дедубликацию
        Set<Person> personSet = new HashSet<>();
        for (int i = 0; i < listPerson.size(); i++) {
            for (int j = 0; j < listPerson.size(); j++) {
                Person lastName = listPerson.get(i);
                Person firstNme = listPerson.get(j);
                if (lastName.equals(firstNme)) personSet.add(lastName);
            }
        }

        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Set<Person> personSet1 = new HashSet<>();
        for (int i = 0; i < 2000; i++) {
            personSet1.add(new Person());
        }
        System.out.printf(String.valueOf(personSet.size()));
    }
}
