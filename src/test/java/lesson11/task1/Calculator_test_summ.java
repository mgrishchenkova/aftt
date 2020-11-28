package lesson11.task1;

import org.junit.jupiter.api.Test;

public class Calculator_test_summ {
    @Test
    public void testSumm() {

        System.out.println(Calculator.summ(3, 5));
        System.out.println(Calculator.summ(1, 2, 3, 4, 5, 6));
    }

}
