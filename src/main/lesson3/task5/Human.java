package main.lesson3.task5;

import java.util.Random;

public class Human {
    String name;
    Cat[] cat;
    Dog[] dog;
    public Human(){

        this.name=Names.randomNamesHuman();
        cat = new Cat[new Random().nextInt(5)];
        for (int i = 0; i < cat.length; i++) {
            cat[i] = new Cat();
        }
        dog = new Dog[new Random().nextInt(3)];
        for (int i = 0; i < dog.length; i++) {
            dog[i] = new Dog();
        }

    }
}
