package main.lesson7.task4;

import main.lesson6.task3.Lesson;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        double amount = 300_000d;
        double rate = 16.9d;
        int duration = 12;
        BaseCredit credit1 = new BaseCredit(amount,rate,duration);

        DifferentiateCredit credit2 = new DifferentiateCredit(amount,rate,duration);
        AnnuityCredit credit3 = new AnnuityCredit(amount,rate,duration
        );

        List<Double> credits1 = credit1.getMonthPayments();
        List<Double> credits2 = credit2.getMonthPayments();
        List<Double> credits3 = credit3.getMonthPayments();

        for (int i = 0; i < credits1.size(); i++) {
            System.out.printf("%d: %.2f   %.2f   %.2f%n", i + 1, credits1.get(i), credits2.get(i), credits3.get(i));
        }

        System.out.printf("Переплата по каждому кредиту:%n %.2f  %.2f  %.2f",
                credit1.calculateOverpayment(), credit2.calculateOverpayment(), credit3.calculateOverpayment());

    }
}
