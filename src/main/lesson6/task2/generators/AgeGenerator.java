package main.lesson6.task2.generators;

import java.util.Random;

public class AgeGenerator {

    private static int generate(){
        return (new Random().nextInt(55)+20);
    }

}
