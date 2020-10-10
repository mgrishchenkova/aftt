package main.lesson4.task2;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws ParseException, IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Human[] human = new Human[2];

        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Введите строку в формате ");
            String str = s.nextLine();
            if (!Validator.validStr(str) == true) continue;
            {
                String[] strRaz = Validator.razdelitel(str);
                Human human1 = new Human();
                human1.setLastName(strRaz[0]);
                human1.setFirstName(strRaz[1]);
                human1.setBirthDate(sdf.parse(strRaz[2]));
                System.out.println("все ок");
              ;
                if (! Validator.validHuman(human1)) continue;
                int i = 0;
                human[i++] = human1;

                if (!Validator.validArrayHuman(human)) break;
            }
        }

    }
}
