package main.lesson8.task3;

public class EleksnetTerminal extends Terminal{

    public EleksnetTerminal(Street street,  double amount, String phoneNumber) {
        super(street, FirmName.ELEKSNET, amount, phoneNumber);
    }

    @Override
    public double sm() {

            if (amount > 0 & amount <= 300)
                amount = amount;
            if (amount > 300)
                amount = amount - amount * 11 / 100;
            if (amount < 0)
                System.out.print("Ошибка!");
            return amount;
        }
    @Override
    public void topUp(){
        System.out.printf("Внесена сумма %s для пополнения телефона %s. Баланс пополнен на сумму %.2f.%n С уважением, ваш %s, %s",amount,phoneNumber,sm(),firmName.getFirmName(),street.getStreet());

    }
}
