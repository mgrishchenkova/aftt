package lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

public class Task6 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/lesson14/dataset.json");

    @Test
    void testAllProperties() {
        long count = persons.stream()
                .flatMap(person -> person.getProperties().stream())
                .count();
        System.out.println(count);

        long countLiving = persons.stream()
                .map(Person::getProperties)
                .flatMap(Collection::stream)
                .filter(properties -> properties.getType().equals("Жилая"))
                .count();
        System.out.println(countLiving);

        long countNotLiving = persons.stream()
                .map(Person::getProperties)
                .flatMap(Collection::stream)
                .filter(properties -> properties.getType().equals("Нежилая"))
                .count();
        System.out.println(countNotLiving);


        Assertions.assertEquals(count, countLiving + countNotLiving);
    }

}
