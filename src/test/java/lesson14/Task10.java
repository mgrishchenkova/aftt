package lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Accounts;
import lesson14.model.Person;
import lesson14.model.Properties;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task10 {
    List<Person> persons= JsonHelper.getPersonsFromFile("src/test/java/lesson14/dataset.json");

    @Test
    void testSum(){
        double sumAcc=persons.stream()
                .filter(person -> !person.getAccounts().isEmpty())
                .map(Person::getAccounts)
                .flatMap(accounts -> accounts.stream())
                .map(account -> account.getAccountBalance())
                .reduce((balance1, balance2) -> balance1 + balance2)
                .get();

        double sumProp=persons.stream()
                .map(Person::getProperties)
                .flatMap(properties -> properties.stream())
                .map(Properties::getPrice)
                .reduce((price1, price2)->price1+price2)
                .get();

        System.out.printf("%.2f%n", sumAcc);
        System.out.printf("%.2f%n", sumProp);
    }
}
