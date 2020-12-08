package lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task3 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/lesson14/dataset.json");

    @Test
    void testTask2() {
        long count = persons.stream()
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getPassport().getSeries().startsWith("00"))
                .peek(person -> System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic()))
                .count();
        Assertions.assertEquals(5, count);
    }
}