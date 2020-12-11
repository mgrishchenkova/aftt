package lesson14;

import lesson14.helpers.JsonHelper;
import lesson14.model.Cards;
import lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Task8 {

    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/lesson14/dataset.json");

    private boolean activeCards(Cards cards) throws ParseException {
        boolean isActive;
        try {
            Date cardDate = new SimpleDateFormat("MM.yy").parse(cards.getEndDateMonth() + "." + cards.getEndDateYear());
            return cardDate.after(new Date());
        } catch (ParseException exception) {
            throw new RuntimeException();
        }

    }

    @Test
    void testCards() throws ParseException {
        long testAllActive = persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(cards -> {
                    try {
                        return activeCards(cards);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    return false;
                })
                .count();
        System.out.println(testAllActive);

        long testActiveVisa = persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(cards -> {
                    try {
                        return activeCards(cards);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    return false;
                })
                .filter(cards -> cards.getType().equals("VISA"))
                .count();
        System.out.println(testActiveVisa);

        long testActiveMC = persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(cards -> {
                    try {
                        return activeCards(cards);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    return false;
                })
                .filter(cards -> cards.getType().equals("MasterCard"))
                .count();
        System.out.println(testActiveMC);
        long testActiveM = persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(cards -> {
                    try {
                        return activeCards(cards);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    return false;
                })
                .filter(cards -> cards.getType().equals("Ã»–"))
                .count();
        System.out.println(testActiveM);

        Assertions.assertEquals(testAllActive,testActiveM+testActiveMC+testActiveVisa);
    }
}
