package main.lesson4.task4;

public class Human {
   private static String lastName;
    private static String firstName;
    private static int age;
    Passport passport;

    public Human setLastName(String lastName){
        this.lastName=lastName;
        return this;
    }
    public Human setFirstName(String firstName){
        this.firstName=firstName;
        return this;
    }

    public Human setAge(int age){
        this.age=age;
        return this;
    }

    public Human setPassport(Passport passport){
        if (passport==null){
            System.out.println("Не удалось прикрепить паспорт null");
            return this;
        }
        if (passport.getNumber()!=null & passport.getSeries()!=null) {
            System.out.printf("Прикрпелен паспорт с серией: %s и номером: %s к человеку %s%n",passport.getSeries(), passport.getNumber(), lastName,firstName);
            this.passport = passport;
        } else
            System.out.printf("Ошибка: не удалось прикрепить паспорт c серией %s и номером %s%n",passport.getSeries(), passport.getNumber());
            return this;
        }




    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }

    public int getAge(){
        return age;
    }
    public Passport getPassport(){
       return passport;
    }
}
