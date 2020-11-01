package main.lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class AnnuityCredit  extends BaseCredit{
    public AnnuityCredit(double amount, double rate, double duration) {
        super(amount, rate, duration);
    }

    @Override
    public List<Double> getMonthPayments(double amount, double rate, double duration) {
        rate=rate/12;
        List<Double> paymentSchedule=new ArrayList<>();
        for ( int i=0;i<=duration;i++ ){
            paymentSchedule.add(amount*((rate)+(rate/(Math.pow((1+rate),duration) +1))));
        }
        return paymentSchedule;
    }
}
