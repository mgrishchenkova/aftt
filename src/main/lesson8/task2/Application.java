package main.lesson8.task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        for (int i = 10; i <= 30; i++) {
            int dubl = 0;
            {
                for (int j = 0; j < 100000; j++) {
                    Set<Person> personSet = new HashSet<>();
                    for (int k = 0; k < i; k++) {
personSet.add(new Person());
                    }
                    if (personSet.size()!=i) dubl++;
                }
            }
            double probability=dubl/1000;
            System.out.printf("%d: %.2f %%%n", i, probability);
        }
    }
}
