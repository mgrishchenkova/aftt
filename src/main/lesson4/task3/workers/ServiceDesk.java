package main.lesson4.task3.workers;

public class ServiceDesk {
    public static int ticketNumber;

    public static void createTicket(String description) {

        String regexAcc = "[^.]*(справк|отчет|бюджет)[^.]*(\\.|$)";
        String regexCl = "[^.]*(уборк)[^.]*(\\.|$)";
        String regexLog = "[^.]*(доставк|курьер)[^.]*(\\.|$)";
        String regexSD = "[^.]*(компьютер|принтер|сервер)[^.]*(\\.|$)";
        System.out.printf("Заявка %d была создана: %s%n", ++ticketNumber, description);
        if (description.matches(regexAcc)) {

            Accountant.takeTicket(ticketNumber);
            return;
        }
        if (description.matches(regexCl)) {
            Cleaner.takeTicket(ticketNumber);
            return;
        }
        if (description.matches(regexLog)) {
            Logistician.takeTicket(ticketNumber);
            return;
        }
        if (description.matches(regexSD)) {
           SysAdmin.takeTicket(ticketNumber);
            return;
        } else System.out.printf("Специалист по выполнению заявки %n не найден", ticketNumber);

    }


}

