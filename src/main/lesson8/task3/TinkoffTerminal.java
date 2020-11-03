package main.lesson8.task3;

public class TinkoffTerminal extends Terminal{

    public TinkoffTerminal(Street street,  double amount, String phoneNumber) {
        super(street, FirmName.TINKOFF, amount, phoneNumber);
    }



    @Override
    public void topUp(){
        if ( amount < 100) {
            System.out.printf("Внесена сумма %s для пополнения телефона %s. Баланс НЕ пополнен, так как минимальная сумма 100!. С уважением, ваш %s, %s", amount, phoneNumber,  firmName.getFirmName(), street.getStreet());

        }
        if (amount >= 100 & amount<=600) {
            System.out.printf("Внесена сумма %s для пополнения телефона %s. Баланс пополнен на сумму %.2f.%n С уважением, ваш %s, %s", amount, phoneNumber, (amount - amount * 7 / 100), firmName.getFirmName(), street.getStreet());

        }
        if (amount > 600 ) {
            System.out.printf("Внесена сумма %s для пополнения телефона %s. Баланс пополнен на сумму %.2f.%n С уважением, ваш %s, %s", amount, phoneNumber, (amount - amount * 9 / 100), firmName.getFirmName(), street.getStreet());

        }
    }
    }

