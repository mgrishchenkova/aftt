package main.lesson3.task5;

import java.util.Random;

public class Cat {
    int age;
    String name;

   public Cat(int age,String name){
       this.name=Names.randomNameCat();
       age=new Random().nextInt(20);

    }

    public Cat() {

    }
}
