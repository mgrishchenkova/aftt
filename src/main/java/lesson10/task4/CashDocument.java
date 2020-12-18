package lesson10.task4;

import java.util.Map;
import java.util.UUID;

public class CashDocument implements Generatable {
    private SalaryDocument salaryDocument;
    private Double[] nominals;
    private String uuid;
    private Map<Double, Integer> cashNominalAmounts;

    @Override
    public CashDocument generate() {
        salaryDocument = DocumentQueue.QUEUE.poll();
        nominals = Property.CASH_NOMINALS;
        uuid = UUID.randomUUID().toString();
        return this;
    }
}