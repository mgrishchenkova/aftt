package lesson14;

import lesson14.helpers.PersonFilterHelper;
import lesson14.model.Person;
import lesson14.model.Properties;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task12 {
    List<Person> persons = PersonFilterHelper.getFilteredPersons();
    @Test
    void testOutPut() {
        persons.stream()
               // .map(Person::getProperties)
                .sorted((p1,p2)->{
                    Double summ1 = p1.getProperties().stream().map(Properties::getPrice).reduce(Double::sum).get();
                    Double summ2 = p2.getProperties().stream().map(Properties::getPrice).reduce(Double::sum).get();
                    return summ2.compareTo(summ1);
                })
                .forEach(person -> System.out.printf("ФИО: %s %s %s, Суммарная стоимость недвижимости: %.2f%n",
                        person.getLastName(), person.getFirstName(), person.getPatronymic(),
                        person.getProperties().stream().map(Properties::getPrice).reduce((p1,p2)->p1+p2).get()
                ));


    }



    }

