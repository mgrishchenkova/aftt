package main.lesson6.task3;

public enum DayOfWeek {
    MONDAY("пн"),
    TUESDAY("вт"),
    WEDNESDAY("ср"),
    THURSDAY("чт"),
    FRIDAY("пт"),
    SATURDAY("сб");
   // SUNDAY("вс");
    private String day;

    DayOfWeek(String day) {
        this.day = day;
    }
    public String getDay() {
        return day;
    }


}
