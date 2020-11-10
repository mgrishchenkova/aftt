package main.lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class AnnuityCredit  extends BaseCredit{
    public AnnuityCredit(double amount, double rate, double duration) {
        super(amount, rate, duration);
    }
    List<Double> paymentSchedule=new ArrayList<>();
    @Override
    public List<Double> getMonthPayments() {

        rate=rate/100/12;
        for ( int i=0;i<duration;i++ ){

            paymentSchedule.add(amount*(rate+(rate/(Math.pow((1+rate),duration) -1))));
        }
        return paymentSchedule;
    }

    @Override
    public Double calculateOverpayment() {


           double sum =duration*paymentSchedule.get(0);
        return sum -amount;

    }
}

