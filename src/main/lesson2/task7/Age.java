package main.lesson2.task7;

public class Age {

    public static void main(String[] args) {
        Age instance = new Age();
        System.out.println(instance.age(32));
        System.out.println(instance.age(52));
        System.out.println(instance.age(66));
        System.out.println(instance.age(82));
        System.out.println(instance.age(25));
        System.out.println(instance.age(44));
        System.out.println(instance.age(60));
        System.out.println(instance.age(75));
        System.out.println(instance.age(22));
        System.out.println(instance.age(119));


    }

    String age(int i) {
        String result = "";
        if (i >= 25 & i < 44) {
            result = "молодой возраст";
        } else if (i >= 44 & i < 60) {
            result = "средний возраст";
        } else if (i >= 60 & i < 75) {
            result = "пожилой возраст";
        } else if (i >= 75 & i < 90) {
            result = "старческий возраст";
        } else
            result = "неизвестный возраст";
        return (result);
    }
}
