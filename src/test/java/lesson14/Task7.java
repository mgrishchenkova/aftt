package lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

public class Task7 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/lesson14/dataset.json");

    @Test
    void testAccounts() {
        long allCount = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .count();
        System.out.println(allCount);

        long allPayment = persons.stream()
                .map(Person::getAccounts)
                .flatMap(Collection::stream)
                .filter(accounts -> accounts.getAccountType().equals("Расчетный"))
                .count();
        System.out.println(allPayment);

        long allDepozit = persons.stream()
                .map(Person::getAccounts)
                .flatMap(Collection::stream)
                .filter(accounts -> accounts.getAccountType().equals("Депозитный"))
                .count();
        System.out.println(allDepozit);

        long allCurrent = persons.stream()
                .map(Person::getAccounts)
                .flatMap(Collection::stream)
                .filter(accounts -> accounts.getAccountType().equals("Текущий"))
                .count();
        System.out.println(allCurrent);
        Assertions.assertEquals(allCount, allCurrent + allDepozit + allPayment);
    }
}
