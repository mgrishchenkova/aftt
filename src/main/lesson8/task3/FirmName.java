package main.lesson8.task3;

public enum FirmName {
    TINKOFF("АО «Тинькофф»"),
    ELEKSNET("ООО «Элекснет»"),
    QIWI("ООО «Киви»");

    private String firmName;

    FirmName(String firmName){
        this.firmName=firmName;
    }

    public String getFirmName() {
        return firmName;
    }
}
