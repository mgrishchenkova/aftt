package main.lesson8.task4;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
       Entity account = new Account("ля ля", "ffff");
       Entity account1 = new Account("nhekzk", "dcsdv");


        List<Entity> entityList = new ArrayList<>();
        entityList.add(account);
        entityList.add(account1);
for ( Entity entityList1:entityList){
    entityList1.validate();
}
    }
}
