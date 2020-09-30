package main.lesson3.task5;

public class Application {
    public static void main(String[] args) {
        Human[] humans = new Human[20];
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human();
        }

        for (Human human : humans) {
            for (Human otherHuman : humans) {
                if (human != otherHuman && human.cat.length == otherHuman.cat.length && human.dog.length == otherHuman.dog.length)
                    System.out.printf("%s: %d кошек, %d собак%n", human.name, human.cat.length, human.dog.length);
            }
        }
    }
}
