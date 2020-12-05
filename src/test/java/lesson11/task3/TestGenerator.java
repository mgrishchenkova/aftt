package lesson11.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class TestGenerator {
    @Test
    public void testRandomInteger() {
        for (int i = 0; i <= 1000; i++) {
            int start = new Random().nextInt(15);
            int end = new Random().nextInt(45);
            int randomTest = Generator.randomInteger(15, 45);
            Assertions.assertEquals(start, end, randomTest);
        }
    }
}
