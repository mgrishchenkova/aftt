package main.lesson8.task3;

public class EleksnetTerminal extends Terminal {

    public EleksnetTerminal(Street street, double amount, String phoneNumber) {
        super(street, FirmName.ELEKSNET, amount, phoneNumber);
    }



    @Override
    public void topUp() {
        if (amount>0 & amount <= 300) {
            System.out.printf("Внесена сумма %s для пополнения телефона %s. Баланс пополнен на сумму %.2f.%n С уважением, ваш %s, %s", amount, phoneNumber, amount, firmName.getFirmName(), street.getStreet());

        }
        if (amount > 300) {
            System.out.printf("Внесена сумма %s для пополнения телефона %s. Баланс пополнен на сумму %.2f.%n С уважением, ваш %s, %s", amount, phoneNumber, (amount - amount * 11 / 100), firmName.getFirmName(), street.getStreet());

        }
    }
}
