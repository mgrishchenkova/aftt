package lesson14.helpers;

import lesson14.model.Person;
import lesson14.model.Properties;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonFilterHelper {

    public static List<Person> getFilteredPersons() {
        List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/lesson14/dataset.json");
        List<Person> newPerson = persons.stream()
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getCards().size() == 3)
                .filter(person -> !person.getProperties().isEmpty())
                .filter(person -> person.getProperties().stream()
                        .map(Properties::getPrice)
                        .reduce((p1, p2) -> p1 + p2)
                        .get() > 20_000_000)
                .collect(Collectors.toList());
        Assertions.assertEquals(20, newPerson.size());
        return newPerson;
    }

}
