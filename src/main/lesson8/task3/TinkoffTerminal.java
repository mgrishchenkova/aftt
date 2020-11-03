package main.lesson8.task3;

public class TinkoffTerminal extends Terminal{

    public TinkoffTerminal(Street street,  double amount, String phoneNumber) {
        super(street, FirmName.TINKOFF, amount, phoneNumber);
    }

    @Override
    public double sm() {
            if ( amount>=100 & amount<=600)
                amount=amount;
            if (amount>600)
                amount=amount-9*amount/100;
           if (amount<100)
                System.out.print("Ошибка!!");
            return amount;
        }

    @Override
    public void topUp(){
        System.out.printf("Внесена сумма %s для пополнения телефона %s. Баланс пополнен на сумму %.2f.%n С уважением, ваш %s, %s",amount,phoneNumber,sm(),firmName.getFirmName(),street.getStreet());

    }
    }

