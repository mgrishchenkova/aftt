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
import java.util.stream.Collectors;

public class Task4 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/lesson14/dataset.json");

    @Test
    void testPassportCardsAccounts() {
        List<Person> filteredPersons = persons.stream()
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getCards().size() == 0 & person.getAccounts().size() == 3)
                .collect(Collectors.toList());

        Assertions.assertEquals(0, filteredPersons.size());
        boolean seriesValid = filteredPersons.stream()
                .allMatch(person -> person.getPassport().getSeries().matches("^[0-9]{4}$"));
        boolean mathSeries = filteredPersons.stream()
                .anyMatch(person -> person.getPassport().getSeries().matches("^[0-9]{4}$"));
        boolean noSeries = filteredPersons.stream()
                .noneMatch(person -> person.getPassport().getSeries().matches("^[0-9]{4}$"));

        System.out.println(seriesValid);
        System.out.println(mathSeries);
        System.out.println(noSeries);
    }

    private Boolean activeCards(Cards card) {
        boolean isActive;
        try {
            Date cardDate = new SimpleDateFormat("MM.yy").parse(card.getEndDateMonth() + "." + card.getEndDateYear());
            return cardDate.after(new Date());
        } catch (ParseException exception) {
            throw new RuntimeException();
        }
    }

    @Test
    void testCards() {
        long countAll = persons.stream()
                .filter(person1 -> !person1.getCards().isEmpty())
                .count();
        System.out.println(countAll);
        long activeCard=persons.stream()
                .filter(person -> !person.getCards().isEmpty())
                .filter(person -> person.getCards().stream()
                .allMatch(this::activeCards))
                .count();
        System.out.println(activeCard);
        long inActiveCard=persons.stream()
                .filter(person -> !person.getCards().isEmpty())
                .filter(person -> person.getCards().stream()
                        .noneMatch(this::activeCards))
                .count();
        System.out.println(inActiveCard);
        long allCards = persons.stream()
                .filter(person -> !person.getCards().isEmpty())
                .filter(person -> person.getCards().stream().anyMatch(this::activeCards)
                && person.getCards().stream().anyMatch(cards -> !activeCards(cards)))
                .count();
        System.out.println(allCards);

       Assertions.assertEquals(462,activeCard+inActiveCard+allCards);


    }
}
