package main.lesson6.task2;

import main.lesson5.task4.Cat;
import main.lesson6.task2.generators.HumanGenerator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        Set<Human> humans = new HashSet<>();
        for (int i = 0; i < 2000; i++) {
            humans.add(HumanGenerator.generate());
        }
        Iterator<Human> iterator = humans.iterator();
        while (iterator.hasNext()) {
            Human human = iterator.next();
            Set<PhoneType> phoneTypes = human.getPhones().keySet();
            // На самом деле можем просто проверять то, что human.getPhones().size() == 3, но так более читаемо и гибко:
            if (phoneTypes.contains(PhoneType.Home) && phoneTypes.contains(PhoneType.Mobile) && phoneTypes.contains(PhoneType.Office)) {
                System.out.printf("%s %s, возраст %d, тел: дом. %s, моб. %s, раб. %s%n",
                        human.getLastName(), human.getFirstName(), human.getAge(),
                        human.getPhones().get(PhoneType.Home), human.getPhones().get(PhoneType.Mobile), human.getPhones().get(PhoneType.Office));
            }
            // Удаляем людей, у которых есть хотя бы 1 телефон
            if (phoneTypes.contains(PhoneType.Home) || phoneTypes.contains(PhoneType.Mobile) || phoneTypes.contains(PhoneType.Office))
                iterator.remove();
        }

        System.out.println("Количество людей после удаления: " + humans.size());
    }
}
