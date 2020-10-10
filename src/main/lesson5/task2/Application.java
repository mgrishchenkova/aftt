package main.lesson5.task2;

public class Application {
    public static void main(String[] args) {
        Cat cat0 = new Cat("Барсик", 1);
        Cat cat1 = new Cat("Мурзик", 1);
        Cat cat3 = new Cat("Муся", 3);
        Cat cat4 = new Cat("Дуся", 4);
        Cat[] cats = {cat0, cat1, null, cat3, cat4};

        for (Cat catt: cats){
            try {
                System.out.printf("Имя: %s, Возраст: %d%n", catt.getName(), catt.getAge());
            } catch (NullPointerException exception) {
                System.out.println("Возникла ошибка вывода информации: ссылка на null");

            }
        }
    }
}
