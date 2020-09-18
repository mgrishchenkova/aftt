package main.lesson1.task4;

import java.text.DecimalFormat;

public class number4 {

    public static void main (String[] args){
        number4 instance = new number4();

        System.out.println(instance.b(118));
        System.out.println(instance.b(800));
        System.out.println(instance.b(278));


    }
    int b (int m){

       return(m/100);


    }
}
