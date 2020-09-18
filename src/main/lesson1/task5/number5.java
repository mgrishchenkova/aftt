package main.lesson1.task5;

import main.lesson1.task4.number4;

public class number5 {
    boolean result;
    public static void main (String[] args){
        number5 instance = new number5();

        System.out.println("первый метод " + instance.or(false,false));
        System.out.println("первый метод " + instance.or(false,true));
        System.out.println("первый метод " + instance.or(true,false));
        System.out.println("первый метод " + instance.or(true,true));
        System.out.println("второй метод " + instance.invert(false,false));
        System.out.println("второй метод " + instance.invert(false,true));
        System.out.println("второй метод " + instance.invert(true,false));
        System.out.println("второй метод " + instance.invert(true,true));}

        boolean or ( boolean a,boolean b)
        {

        result=!(a | b);
        return result;
        }

        boolean invert ( boolean a,boolean b)
        {

          a=!a;
          b=!b;
            result=a & b;
            return result;
        }

}
