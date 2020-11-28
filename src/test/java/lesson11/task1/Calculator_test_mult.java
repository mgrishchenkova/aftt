package lesson11.task1;

import org.junit.jupiter.api.Test;

public class Calculator_test_mult {

    @Test
    public void testMult() {
        System.out.println(Calculator.mult(3, 2));
        System.out.println(Calculator.mult(1, 2, 3, 4, 5, 6));
    }
}
