package main.lesson8.task3;

public abstract class Terminal implements TopUpBalance {
     Street street ;//	Адрес терминала
 FirmName firmName;//Фирма-владелец терминала (использовать enum)
protected int rate; //Комиссия за операцию
protected double amount;//	Сумма, свыше которой комиссии нет
    protected String phoneNumber;

    public Terminal(Street street, FirmName firmName,  double amount, String phoneNumber) {
        this.street=street;
        this.firmName=firmName;
        this.amount=amount;

        this.phoneNumber=phoneNumber;
    }


    @Override
    public void topUp(){

    }


}
