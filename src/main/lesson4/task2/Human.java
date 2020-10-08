package main.lesson4.task2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    private String lastName;
    private String firstName;
    private Date birthDate;
    private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    Human() {

    }

    //сеттеры

    public void setLastName(String lastName) {
        String regex = "^([А-ЯЁ][а-яё]{2,50})$";
        if (lastName.matches(regex)) {
            this.lastName = lastName;
            setCorrectPrint("фамилии", lastName);

        } else {
            setIncorrectPrint(lastName);
        }

    }


    public void setFirstName(String firstName) {
        String regex = "^([А-ЯЁ][а-яё]{2,50})$";
        if (firstName.matches(regex)) {
            this.firstName = firstName;
            setCorrectPrint("имени", firstName);

        } else {
            setIncorrectPrint(firstName);
        }

    }

    public void setBirthDate(Date birthDate) {
        Date today = new Date();
        if (birthDate.before(today)) {
            this.birthDate = birthDate;
            setCorrectPrint("даты рождения", DATE_FORMAT.format(birthDate));
        } else {
            setIncorrectPrint(DATE_FORMAT.format(birthDate));
        }
    }
    //геттеры

    public String getLastName() {
        getPrint("фамилии",lastName);
        return lastName;
    }

    public String getFirstName() {
        getPrint("имени",firstName);
        return firstName;
    }

    public Date getBirthDate() {
        String date = birthDate != null
                ? DATE_FORMAT.format(birthDate)
                : null;
        getPrint("дата рождения", date);
        return birthDate;
    }

    private void getPrint(String type, String value) {

        System.out.printf("Получено значение %s: %s%n", type, value);
    }

    public void setCorrectPrint(String type, String value) {
        System.out.printf("Установлено корректное значение %s: %s%n", type, value);
    }

    public void setIncorrectPrint(String value) {
        System.out.printf("Введенное значение некорректно %s%n", value);
    }
}


