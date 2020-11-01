package main.lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class DifferentiateCredit extends BaseCredit{
    public DifferentiateCredit(double amount, double rate, double duration) {
        super(amount, rate, duration);
    }

    @Override
    public List<Double> getMonthPayments(double amount, double rate, double duration) {
        List<Double> paymentSchedule = new ArrayList<>();


    }
}
