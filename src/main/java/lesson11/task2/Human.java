package lesson11.task2;

public class Human {
    private String firstName;
    private int age;

    public Human() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.matches("^([À-ß¨][à-ÿ¸]{2,11})$"))
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("Íåêîğğåêòíîå èìÿ:" + firstName);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120)
            this.age = age;
        else
            throw new IllegalArgumentException("Íåêîğğåêòíûé âîçğàñò:" + age);

    }
}
