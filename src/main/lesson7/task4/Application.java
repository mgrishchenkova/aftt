package main.lesson7.task4;

import main.lesson6.task3.Lesson;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        BaseCredit credit1= new BaseCredit(300_000, 16.9, 12);

        DifferentiateCredit credit2=new DifferentiateCredit(300_000, 16.9, 12);
        AnnuityCredit credit3 = new AnnuityCredit(300_000, 16.9, 12);

        List<Double> credits =credit1.getMonthPayments();
        for (int i = 0; i < credits.size(); i++) {
            System.out.printf("%d: %.2f   %.2f   %.2f%n", i + 1, credits.get(i), credits.get(i), credits.get(i));
        }
        List<Double> credits2 =credit2.getMonthPayments();
        for (int i = 0; i < credits2.size(); i++) {
            System.out.printf("%d: %.2f   %.2f   %.2f%n", i + 1, credits2.get(i), credits2.get(i), credits2.get(i));
        }

        List<Double> credits3 =credit3.getMonthPayments();
        for (int i = 0; i < credits3.size(); i++) {
            System.out.printf("%d: %.2f   %.2f   %.2f%n", i + 1, credits3.get(i), credits3.get(i), credits3.get(i));
        }



    }
}
