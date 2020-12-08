package lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

public class Task2 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/lesson14/dataset.json");

    @Test
    void testSeriesSort() {
        long count = persons.stream()
                .filter(person -> person.getPassport()!=null)
                .filter(person -> person.getPassport().getSeries().startsWith("00"))
                .sorted((p1, p2) -> p2.getPassport().getNumber().compareTo(p1.getPassport().getNumber()))
                .peek(person -> System.out.printf("%s %s %s %s %s %n", person.getLastName(), person.getFirstName(), person.getPatronymic(),person.getPassport().getSeries(), person.getPassport().getNumber()))
                .count();
        //Assertions.assertEquals(10, count);
    }
    @Test
    void testSeriesNumber(){
       Person person = persons.stream()
                .filter(person1 -> person1.getPassport()!=null)
                .filter(person1 -> person1.getPassport().getNumber().endsWith(person1.getPassport().getSeries()))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
        System.out.printf("%s %s %s %s %s%n",person.getLastName(),person.getFirstName(),person.getPatronymic(),person.getPassport().getSeries(),person.getPassport().getNumber());
    }
}
