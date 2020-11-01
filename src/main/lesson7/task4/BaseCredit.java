package main.lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class BaseCredit {
    private double amount;
    private double duration;
    private double rate;

    public BaseCredit(double amount, double rate, double duration) {
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
    }

    public List<Double> getMonthPayments(double amount, double rate, double duration) {
List<Double> paymentSchedule = new ArrayList<>();
for ( int i=0;i<=duration;i++) {
    paymentSchedule.add(amount / duration);
}
return paymentSchedule;
}

    }

