package lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task1 {
    private List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/lesson14/dataset.json");

@Test
    void notPassport(){
    long count = persons.stream()
            .filter(person -> person.getPassport() == null)
            .filter(person -> person.getProperties().size() == 3)
            .peek(person -> System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic()))
            .count();
    Assertions.assertEquals(3, count);
}

    @Test
    void testAccountCards() {
        long count = persons.stream()
                .filter(person -> person.getLastName().equals("Васильев"))
                .filter(person -> person.getCards().size()!=person.getAccounts().size())
                .peek(person -> System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic()))
                .count();
        Assertions.assertEquals(10, count);
    }
    @Test
    void testSeries() {
        long count = persons.stream()
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getPassport().getSeries().startsWith("00"))
                //.limit(5)
                .peek(person -> System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic()))
                .count();
        Assertions.assertEquals(5, count);
    }
}
