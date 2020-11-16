package main.lesson8.task4;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public class ValidatorStub {
    private static Set<Entity> entitySet = new HashSet<>();

    public static void validateEntity(Entity entity) {


        System.out.printf("Сущность до валидации: %s%n", entity);

        if (entitySet.contains(entity)) {

            for (Entity validEntity : entitySet) {
                if (validEntity.equals(entity)) {
                    String uuid = validEntity.getUuid();
                    entity.setUuid(uuid);
                }
            }

        } else {
            entity.uuid = UUID.randomUUID().toString();
            entitySet.add(entity);
        }
        System.out.printf("Сущность после валидации: %s%n", entity);

    }

}
