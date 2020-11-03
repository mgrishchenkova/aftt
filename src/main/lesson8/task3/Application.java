package main.lesson8.task3;

public class Application {
    public static void main(String[] args) {
        QiwiTerminal qiwiTerminal = new QiwiTerminal(Street.QIWI1STREET,1001,"7965515");
        EleksnetTerminal eleksnetTerminal = new EleksnetTerminal(Street.ELEKSNETSTREET1,500,"7951155");
     TinkoffTerminal tinkoffTerminal = new TinkoffTerminal(Street.TINKOFF,100,"5513");
        TinkoffTerminal tinkoffTerminal1 = new TinkoffTerminal(Street.TINKOFF,10,"7965515");
        qiwiTerminal.topUp();
        System.out.println();
        tinkoffTerminal1.topUp();
        System.out.println();
        eleksnetTerminal.topUp();
        System.out.println();
        tinkoffTerminal.topUp();

//доделать ошибки
    }
}
