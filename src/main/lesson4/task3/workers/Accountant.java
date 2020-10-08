package main.lesson4.task3.workers;

public class Accountant {
    private int ticketNumber;
    private String name;


    static void takeTicket(int ticketNumber) {
        System.out.printf("Заявка %d была принята бухгалтером%n", ticketNumber);
    }
}
