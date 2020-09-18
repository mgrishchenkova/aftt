package main.lesson1.task3;

public class number3 {
    public static void main(String[] args){
    number3 instance = new number3();
    System.out.println(instance.a(14));
        System.out.println(instance.a(19));

    }

    boolean a ( double n)
    {
        n=n%2;
        return (n!=0);
    }
}
