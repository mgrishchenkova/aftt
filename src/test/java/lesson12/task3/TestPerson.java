package lesson12.task3;

import lesson12.task3.person.Mother;
import lesson12.task3.person.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;

public class TestPerson {

    @Test
    void testPerson() throws IOException, IOException {
        FileHelper<Person> helper = new FileHelper<>();
        Person person = helper.getObjectFromJsonInFile("src/main/java/lesson12/task3/person.json", Person.class);
        Person output = new Person()
                .setName("Иван")
                .setAge(37)
                .setMother(new Mother().setName("Ольга").setAge(58))
                .setChildren(Arrays.asList("Маша", "Игорь", "Таня"))
                .setMarried(true);

        Assertions.assertEquals(output, person);
    }
}
