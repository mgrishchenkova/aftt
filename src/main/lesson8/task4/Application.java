package main.lesson8.task4;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Entity account = new Account("ля ля", "ffff");
        Entity account1 = new Account("nhekzk", "dcsdv");
        Entity account2 = new Account("nhekzk", "dcsdv");


        List<Entity> entities = new ArrayList<>();
        entities.add(account);
        entities.add(account1);
        entities.add(account2);
        for (Entity entity : entities) {
            entity.validate();
        }
    }
}
