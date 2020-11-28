package lesson11.task2;

import org.junit.jupiter.api.Test;

public class TestName {
    @Test
    public void testFirstNameCorrect() {
        Human human = new Human();
       //human.setFirstName("Иван");
        //human.setFirstName("Ив");
        human.setFirstName("Ивансдлиннымименем");
        //human.setFirstName("Иван5аа");
    }
}
