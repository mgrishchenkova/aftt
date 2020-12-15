package lesson13.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TestMax {
    @Test
    void testDouble(){

        Assertions.assertEquals(999.78,Functions.maxObject.execute(Arrays.asList(10.99, 58.98, 44.88, 998.78)));
    }
    @Test
    void testString(){

        Assertions.assertEquals("olol", Functions.maxObject.execute(Arrays.asList("o", "ol", "olo", "olol")));
    }

}
