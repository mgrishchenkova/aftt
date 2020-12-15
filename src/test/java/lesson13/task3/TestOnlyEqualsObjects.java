package lesson13.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class TestOnlyEqualsObjects {
    @Test
    void testEquals() {
        Object object1 = new Object();
        Object object2 = object1;
        Object object3 = object1;
        Object object4 = object1;
        Object object5 = new Object();
        Assertions.assertTrue(Functions.onlyEqualsObjects.execute(Arrays.asList(object1, object2, object3, object4)));
        Assertions.assertTrue(Functions.onlyEqualsObjects.execute(Collections.emptyList()));
        Assertions.assertFalse(Functions.onlyEqualsObjects.execute(Arrays.asList(object1, object2, object3, object4, object5)));
    }

    @Test
    void testString() {
        Assertions.assertEquals(true, Functions.onlyEqualsObjects.execute(Arrays.asList("string1", "string1", "string1")));
        Assertions.assertEquals(false, Functions.onlyEqualsObjects.execute(Arrays.asList("string1", "string1", "string3")));
    }

    @Test
    void testCat() {
        class Cat {
            private String name;
            private int age;

            private Cat(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Cat cat = (Cat) o;
                return age == cat.age &&
                        Objects.equals(name, cat.name);
            }

            @Override
            public int hashCode() {
                return Objects.hash(name, age);
            }
        }
        Cat cat1 = new Cat("Буся", 2);
        Cat cat2 = new Cat("Буся", 2);
        Cat cat3 = new Cat("Киара", 1);
        Cat cat4 = new Cat("Мурзик", 2);
        Assertions.assertEquals(true, Functions.onlyEqualsObjects.execute(Arrays.asList(cat1, cat2, cat3)));
        Assertions.assertEquals(false, Functions.onlyEqualsObjects.execute(Arrays.asList(cat1, cat4, cat3)));
    }


}



