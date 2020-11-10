package main.lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class DifferentiateCredit extends BaseCredit {
    public DifferentiateCredit(double amount, double rate, double duration) {
        super(amount, rate, duration);
    }
    List<Double> paymentSchedule = new ArrayList<>();
    @Override
    public List<Double> getMonthPayments() {

        double b=amount/duration;
        rate=rate/100/12;
        for (int i = 0; i < duration; i++) {

            paymentSchedule.add(b+(amount -b*i)*rate);

        }
        return paymentSchedule;

    }

    @Override
    public Double calculateOverpayment() {
        double sum=0;
        for ( int i=0; i<duration;i++){
            sum+=paymentSchedule.get(i);
        }
        return sum -amount;
    }
}
