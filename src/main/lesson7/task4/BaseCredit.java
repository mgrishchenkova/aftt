package main.lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class BaseCredit {
    protected double amount;
    protected double duration;
    protected double rate;

    public BaseCredit(double amount, double rate, double duration) {
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
    }

    public List<Double> getMonthPayments() {
        List<Double> paymentSchedule = new ArrayList<>();
        for (int i = 0; i < duration; i++) {
            paymentSchedule.add(amount / duration);
        }
        return paymentSchedule;

    }

    public Double calculateOverpayment() {
        Double amount = 0d;
        for (Double currentPayment : getMonthPayments()) {
            amount += currentPayment;
        }
        return amount - this.amount;
    }

}

