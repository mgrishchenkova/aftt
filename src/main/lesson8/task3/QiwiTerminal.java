package main.lesson8.task3;

public class QiwiTerminal extends Terminal {
    public QiwiTerminal(Street street, double amount, String phoneNumber) {
        super(street, FirmName.QIWI, amount, phoneNumber);
    }

    @Override
    public double sm() {
        if (amount > 0 & amount <= 1000)
            amount = amount;
        if (amount > 1000)
            amount = amount - amount * 7.0 / 100;
        if (amount < 0)
            System.out.print("Ошибка!");

        return amount;

    }
    @Override
    public void topUp(){
        System.out.printf("Внесена сумма %s для пополнения телефона %s. Баланс пополнен на сумму %.2f.%n С уважением, ваш %s, %s",amount,phoneNumber,sm(),firmName.getFirmName(),street.getStreet());

    }


}

