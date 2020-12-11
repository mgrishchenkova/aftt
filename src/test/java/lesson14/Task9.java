package lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Accounts;
import lesson14.model.Person;
import lesson14.model.Properties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task9 {
    List<Person> persons= JsonHelper.getPersonsFromFile("src/test/java/lesson14/dataset.json");

    @Test
    void testBalance(){
        long count =persons.stream()
                .filter(person1 -> !person1.getAccounts().isEmpty())
                .filter(person1 -> person1.getAccounts().stream()
                        .map(Accounts::getAccountBalance)
                        .reduce((balance1, balance2) -> balance1 + balance2)
                        .orElseThrow(() -> new IllegalStateException()) > 20000000)
                .count();
        System.out.println(count);

        long countPrice =persons.stream()
                .filter(person1 -> !person1.getProperties().isEmpty())
                .filter(person1 -> person1.getProperties().stream()
                        .map(Properties::getPrice)
                        .reduce((balance1, balance2) -> balance1 + balance2)
                        .orElseThrow(() -> new IllegalStateException()) > 26000000)
                .count();
        System.out.println(countPrice);
        Assertions.assertEquals(count,countPrice);

    }
}
