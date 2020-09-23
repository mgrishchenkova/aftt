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

   // boolean phone2For(String number) {
       // if (candidate == null || candidate.length() != 16)
         //   return false;

      //  int[] numericIndexes = {3, 4, 5, 7, 8, 9, 11, 12, 14, 15}; // Индексы в строке, которые принимают любые цифровые значения
        String numericPattern = "0123456789";

        // Проверяем обязательные элементы паттерны
       // if (!candidate.startsWith("+7("))
         //   return false;
      //  if (candidate.charAt(6) != ')')
        //   return false;
       // if (candidate.charAt(10) != '-' || candidate.charAt(13) != '-')
           // return false;

        // Проверяем остальные цифры в номере, которые могут принимать любые значения
      //  for (int index : numericIndexes) {
          //  String symbol = String.valueOf(candidate.charAt(index));
         //   if (!numericPattern.contains(symbol))
               // return false;
        }
        // Все проверки пройдены успешно, возвращаем true
       // return true;


