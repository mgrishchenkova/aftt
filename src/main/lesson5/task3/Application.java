package main.lesson5.task3;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int n= new Random(). nextInt(5);
        int m= new Random().nextInt(5);
        int total = new Random().nextInt(500)+500;
        int index = 0;

        for (int i = 0; i < total; i++) {
            try {
                int result = m / n;
            } catch (ArithmeticException exception) {
                index++;
            }
        }

        System.out.printf("Из %d операций деления %d было выполнено с ошибкой", total, index);



    }
}
