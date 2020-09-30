package main.lesson3.task5;

import java.util.Random;

public class Dog {
    int age;
    String name;
    public Dog(int age,String name){

            this.name=Names.randomNamesDog();
            age=new Random().nextInt(15);

        }
    public Dog() {

    }
    }

