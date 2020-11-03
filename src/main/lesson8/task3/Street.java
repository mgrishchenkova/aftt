package main.lesson8.task3;

public enum Street {
    QIWI1STREET("г. Москва, ул. Проходчиков, д.3"),
    ELEKSNETSTREET1("г. Москва, Измайловский пр-т, 73/2"),
    ELEKSNETSTREET2("г. Москва, ул. Бакунинская, д.1"),
    ELEKSNETSTREET3("г. Новосибирск, ул. Героев-Десантников, д. 4"),
    TINKOFF("г. Москва, Ленинградский пр-т, д. 15");

    private String street;
    Street( String street){
        this.street=street;
    }

    public String getStreet() {
        return street;
    }
}
