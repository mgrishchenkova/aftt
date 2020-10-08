package main.lesson4.task2;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        Human[] human=new Human[2];
        while (true){
            Scanner s = new Scanner(System.in);
            System.out.println("Введите строку в формате ");
            String str = s.nextLine();
            Validator.validStr(str);
            Validator.razdelitel(str);
        }



    }
}
