package main.lesson1.task6;

import main.lesson1.task5.number5;

public class number6 {
    public static void main (String[] args){
        number6 instance = new number6();
        System.out.println(instance.megaMethods(false,false, false, false));
        System.out.println(instance.megaMethods(true, true, true, true));
        System.out.println(instance.megaMethods(false, true, false, true));
        System.out.println(instance.megaMethods(true, false, true, false));
        System.out.println(instance.megaMethods(true, true, false, false));



    }

    boolean megaMethods ( boolean a, boolean b, boolean c, boolean d){
        boolean result1;
        boolean result2;
        result1=a && b;
        result2=c || d;
        result2=!result2;
     return result1 && result2;


    }
}
