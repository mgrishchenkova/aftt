package lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Accounts;
import lesson14.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task5 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/lesson14/dataset.json");

    @Test
    void testBalanceAccount(){
        long count =persons.stream()

        .filter(person1 -> !person1.getAccounts().isEmpty())
                .filter(person1 -> person1.getAccounts().stream()
                        .map(Accounts::getAccountBalance)
                        .reduce((balance1, balance2) -> balance1 + balance2)
                        .orElseThrow(() -> new IllegalStateException()) <= 2100000)
        .count();
        System.out.println(count);

    }

}
