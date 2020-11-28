package lesson11.task1;

public class Calculator {


    public static int summ(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        return sum;
    }

    public static int mult(int... values) {
        int mult = 1;
        for (int i = 0; i < values.length; i++) {
            mult = mult * values[i];
        }
        return mult;
    }
}
