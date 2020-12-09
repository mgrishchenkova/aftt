package lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task3 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/lesson14/dataset.json");

    @Test
    void testPassportUnique() {
        long seriesCount = persons.stream()
                .filter(person -> person.getPassport() != null)
                .map(person -> person.getPassport().getSeries())
                .distinct()
                .count();
        System.out.println("Количество различных серий паспортов: " + seriesCount);
    }
    @Test
    void testPassport(){
        Person person=persons.stream()
                .filter(person1 -> person1.getPassport()!=null)
                .skip(49)
                .limit(49)
                .findFirst()
                .filter(person1 -> person1.getAccounts().size()==3 & person1.getCards().size()==2)
                .orElse(persons.get(0));
        System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic());
        System.out.printf("%s %s %s%n", person.getAccounts().get(0).getAccountNumber(),
                person.getAccounts().get(1).getAccountNumber(), person.getAccounts().get(2).getAccountNumber());
        System.out.printf("%s %s%n", person.getCards().get(0).getCardNumber(), person.getCards().get(1).getCardNumber());
    }
    @Test
    void testPassSeriesNumber(){
        boolean validPass = persons.stream()
                .filter(pass -> pass.getPassport() != null)
                .map(Person::getPassport)
                .allMatch(passport -> passport.getSeries().matches("[0-9]{4}") && passport.getNumber().matches("[0-9]{6}"));
        if(validPass)
            System.out.println("У всех клиентов, у которых есть паспорт, данные соответствуют формату");
        else System.out.println("Есть клиенты, у которых данные паспорта не соответствуют формату");
    }
}