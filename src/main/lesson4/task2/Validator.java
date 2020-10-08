package main.lesson4.task2;

public class Validator {

    private String str;
    private static  String regex = "^(\\S+) (\\S+) (\\S+)$";

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public static void validStr(String str) {

        String regex = "^(\\S+) (\\S+) (\\S+)$";
        if (str.matches(regex)) {
            System.out.println("Строка валидна");

        } else {
            System.out.println("Строка невалидна");
        }

    }

    public static void razdelitel (String str){
        String delimeter = " ";
        String[] subStr;
        subStr = str.split(delimeter);
        // Вывод результата на экран
        for(int i = 0; i < subStr.length; i++) {
            System.out.println(subStr[i]);
        }

    }
 public static boolean validHuman (Human human) {

     if (human.getLastName() != null & human.getFirstName() != null & human.getBirthDate() != null) {
         System.out.println("Массив валиден");
         return true;

     } else
         System.out.println("Массив невалиден");
         return false;


 }
 public static boolean validArrayHuman ( Human[] human){
        boolean valid=false;
     for (Human array : human) {
         if (array == null) {
             System.out.println("Массив невалиден");
             valid= true;
             break;
         } else System.out.println("Массив валиден");

     }
     return valid;
 }


}
