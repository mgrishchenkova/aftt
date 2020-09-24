package main.lesson2.task3;

import main.lesson2.task1.ConcatString;

public class Phone {
    public static void main(String[] args) {
        String number1 = "+7(964)615-31-34";
        Phone instanse = new Phone();
        System.out.println(instanse.phone1(number1));


    }

    boolean phone1(String number) {

        return number.matches("^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");
    }

    boolean phone2For(String number) {
        if (number == null || number.length() != 16)
            return false;
        int[] numericIndexes = {3, 4, 5, 7, 8, 9, 11, 12, 14, 15}; // Индексы в строке, которые принимают любые цифровые значения
        String numericPattern = "0123456789";

        // Проверяем обязательные элементы паттерны
        if (!number.startsWith("+7("))
            return false;
        if (number.charAt(2) != '(')
            return false;
        if (number.charAt(6) != ')')
            return false;
        if (number.charAt(10) != '-' & number.charAt(13) != '-')
            return false;

        // Проверяем остальные цифры в номере, которые могут принимать любые значения
        for (int index : numericIndexes) {
            String symbol = String.valueOf(number.charAt(index));
            if (!numericPattern.contains(symbol))
                return false;
        }
        // Все проверки пройдены успешно, возвращаем true
        return true;
    }
}


