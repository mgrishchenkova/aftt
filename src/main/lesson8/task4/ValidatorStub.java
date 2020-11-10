package main.lesson8.task4;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public class ValidatorStub {


    public static void validateEntity(Entity entity) {
        Set<Entity> entitySet = new HashSet<>();

        System.out.printf("Сущность до валидации: %s%n", entity);
        for (int i = 0; i < entitySet.size(); i++) {
           if (entitySet.contains(entity)){
              String uuid = entity.getUuid();

           } else {
               entity.uuid = UUID.randomUUID().toString();
               entitySet.add(entity);
               System.out.printf("Сущность после валидации: %s%n", entity);
           }
        }
    }

}
