package main.lesson1.task1;

public class number1 {
    public static void main(String[] args) {
        number1 instance = new number1();

        System.out.println(instance.areaCircle(0));
        System.out.println(instance.areaCircle(2));
        System.out.println(instance.areaCircle(100));
    }


    double areaCircle(int radius) {
        return radius * radius * 3.14;
    }
}




