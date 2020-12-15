package lesson13.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestModifer {
    @Test
    void testInvert() {
        Assertions.assertEquals(true, Modifiers.invert.modify(false));
        Assertions.assertEquals(false, Modifiers.invert.modify(true));

    }

    @Test
    void testReverse() {
        Assertions.assertEquals("privet", Modifiers.reverse.modify("tevirp"));
    }

    @Test
    void testAbs() {
        Assertions.assertEquals(10, Modifiers.absolute.modify(10));
        Assertions.assertEquals(10, Modifiers.absolute.modify(-10));
    }

}
