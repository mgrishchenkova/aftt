package main.lesson8.task3;

public class QiwiTerminal extends Terminal {
    public QiwiTerminal(Street street, double amount, String phoneNumber) {
        super(street, FirmName.QIWI, amount, phoneNumber);
    }


    @Override
    public void topUp(){
        if ( amount>0&&amount <= 1000) {
            System.out.printf("Внесена сумма %s для пополнения телефона %s. Баланс пополнен на сумму %.2f.%n С уважением, ваш %s, %s", amount, phoneNumber, amount, firmName.getFirmName(), street.getStreet());

        }
        if ( amount > 1000) {
            System.out.printf("Внесена сумма %s для пополнения телефона %s. Баланс пополнен на сумму %.2f.%n С уважением, ваш %s, %s", amount, phoneNumber, (amount - amount * 7 / 100), firmName.getFirmName(), street.getStreet());

        }

    }


}

