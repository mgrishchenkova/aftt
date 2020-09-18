package main.lesson1.task2;

public class number2 {
    public static void main(String[] args){
        number2 instance = new number2();
        System.out.println(instance.c(2,7));
        System.out.println(instance.c(6,5));
        System.out.println(instance.c(6,3));
    }
    double a ( double width, double height){
        return width*height;
    }

    double b ( double width, double height){
        return 2*(width+height);
    }

   boolean c (double width, double height){
     return (a(width,height)>b(width,height));
        }
    }

