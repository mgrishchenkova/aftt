package main.lesson4.task4;

public class Human {
   private static String lastName;
    private static String firstName;
    private static int age;
    Passport passport;

    private void setLastName(String lastName){
        this.lastName=lastName;
    }
    private void setFirstName(String firstName){
        this.firstName=firstName;
    }

    private void setAge(int age){
        this.age=age;
    }

    private void setPassport(Passport passport){
        this.passport=passport;
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
