package lesson13.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TestSummFunction {
    @Test
    void TestSummList(){
        List<Integer> list= Arrays.asList(1, 2, 3, 4, 5, 10, 9, 8, 7, 6);
        Assertions.assertEquals(55, Functions.summFunction.execute(list));
    }
}
