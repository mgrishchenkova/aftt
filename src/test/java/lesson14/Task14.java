package lesson14;

import lesson14.helpers.PersonFilterHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Task14 {

    List<Person> persons = PersonFilterHelper.getFilteredPersons();
    SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");

    @Test
    void testOutputDate() {
        persons.stream()
                .sorted((p1, p2) -> {
                    String date1 = p1.getPassport().getIssueDate();
                    String date2 = p2.getPassport().getIssueDate();
                    try {
                        return df.parse(date1).compareTo(df.parse(date2));
                    } catch (ParseException e) {
                        throw new RuntimeException();
                    }
                })
                .forEach(person -> System.out.printf("ФИО: %s%s%s, Паспорт: %s %s, Выдан: %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic(),
                        person.getPassport().getSeries(), person.getPassport().getNumber(), person.getPassport().getIssueDate(), person.getPassport().getIssuer()));
    }

}
