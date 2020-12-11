package lesson14;

import lesson14.helpers.PersonFilterHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task11 {

    @Test
    void testMethods() {
        List<Person> persons = PersonFilterHelper.getFilteredPersons();
        Assertions.assertEquals(20, persons.size());

    }
}
