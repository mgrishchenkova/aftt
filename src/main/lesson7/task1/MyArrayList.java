package main.lesson7.task1;

import java.util.ArrayList;

public class MyArrayList<T> extends ArrayList<T> {

    @Override
    public T get(int index) {
        try {
            System.out.println("Получен объект " + super.get(index) + "  из списка");
            return super.get(index);

        } catch (IndexOutOfBoundsException exception) {
            return null;
        }

    }

    @Override
    public void add(int index, T element) {
        try {
            System.out.println("Добавлен объект " + element + " в список на позицию " + index);
            super.add(index, element);
        } catch (IndexOutOfBoundsException exception) {
            super.add(0, element);
        }

    }

    @Override
    public int size() {
        System.out.println("Размер списка: " + super.size());
        return super.size();

    }

    @Override
    public boolean add(T t) {
        System.out.printf("Добавлен объект %s в список%n", t);
        return super.add(t);
    }

    @Override
    public boolean contains(Object o) {
        System.out.printf("Объект %s содержится в списке%n", super.contains(o) ? "" : "не ");
        return super.contains(o);
    }
}
