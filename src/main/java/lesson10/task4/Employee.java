package lesson10.task4;

import java.util.Random;

public class Employee implements Generatable {
    private String lastName;
    private String firstName;
    private Double salary;
    private Passport passport;

    public Double getSalary() {
        return salary;
    }

    @Override
    public Employee generate() {
        lastName = generatorName(Property.EMPLOYEE_LASTNAME_LENGTH);
        firstName = generatorName(Property.EMPLOYEE_FIRSTNAME_LENGTH);
        Double end = Property.EMPLOYEE_SALARY_MAX - Property.EMPLOYEE_SALARY_MIN;
        salary = new Random().nextDouble() * end + Property.EMPLOYEE_SALARY_MIN;
        passport = new Passport().generate();
        salary *= 100;
        salary = 1d * Math.round(salary) / 100;
        return this;
    }


    private String generatorName(int length) {
        String name = Property.EMPLOYEE_NAME_PATTERN;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= length; i++)
            sb.append(name.charAt(new Random().nextInt(name.length())));
        return sb.toString();
    }
}
