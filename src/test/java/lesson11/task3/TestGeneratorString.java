package lesson11.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class TestGeneratorString {
    @Test
    public void testString(){
        for (int i = 0; i <= 1000; i++) {
            int start = new Random().nextInt(15);
            int end = new Random().nextInt(45);
            String randomTest = Generator.randomString(15, 45);
           // System.out.println(randomTest);
            Assertions.assertTrue(randomTest.matches("^[A-Za-z]$"));
        }
    }
}
