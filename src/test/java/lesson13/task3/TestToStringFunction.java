package lesson13.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestToStringFunction {
    @Test
    void testObject() {
        Assertions.assertEquals("string", Functions.toStringFunction.execute("string"));
    }

    //@Test
    //void test - ���������....
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
            public String toString() {
                return String.format("���: %s, �������: %d", name, age);
            }
        }
        Object cat = new Cat("����", 2);
        Assertions.assertEquals("���: ����, �������: 2", Functions.toStringFunction.execute(cat));
    }
}
