package main.lesson8.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            listPerson.add(new Person());
        }

//дописать дедубликацию
       for(int i = 0; i < listPerson.size()-1; i++) {
         if (listPerson.get(i).equals(listPerson.get(i + 1)))
             listPerson.remove(i);
            i--;
        }

        Set<Person>  personSet = new HashSet<>();
        for( int i=0;i<2000;i++){
            personSet.add(new Person());
        }
        System.out.printf(String.valueOf(personSet.size()));
    }
}
