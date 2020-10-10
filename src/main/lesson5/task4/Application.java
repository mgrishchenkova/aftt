package main.lesson5.task4;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Cat[] cat =new Cat[10];
        int age= new Random().nextInt(100)-50;
int index=0;

        while (index < cat.length) {
            try {
                cat[index] = new Cat("Котя", age);
            } catch (AgeTooHighException exception) {
                cat[index] = null;
                System.out.println("Слишком большой возраст для кота");
            } finally {
                index++;
            }
        }
        for ( Cat cats: cat){
            try {

                System.out.printf("Имя: %s, Возраст: %d%n", cats.getName(), cats.getAge());
            } catch (NullPointerException nullPointerException) {
                System.out.println("Ошибка вывода данных");
            }
        }
    }


}
