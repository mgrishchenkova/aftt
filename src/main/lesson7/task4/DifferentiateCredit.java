package main.lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class DifferentiateCredit extends BaseCredit {
    public DifferentiateCredit(double amount, double rate, double duration) {
        super(amount, rate, duration);
    }

    @Override
    public List<Double> getMonthPayments() {
        List<Double> paymentSchedule = new ArrayList<>();
        for (int i = 0; i < duration; i++) {
            paymentSchedule.add((amount / (rate + duration)) + (amount * rate / 100 * 12));

        }
        return paymentSchedule;

    }
}
