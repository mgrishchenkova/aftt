package main.lesson4.task2;

public class Validator {

    private String str;
    private static String regex = "^(\\S+) (\\S+) (\\S+)$";

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public static boolean validStr(String str) {
        boolean isValidStr;
        String regex = "^(\\S+) (\\S+) (\\S+)$";
        if (str.matches(regex)) {
            return isValidStr = true;

        } else return isValidStr = false;

    }

    public static String[] razdelitel(String str) {
        String delimeter = " ";
        String[] subStr;
        subStr = str.split(delimeter);
        // Вывод результата на экран
        for (int i = 0; i < subStr.length; i++) {
            System.out.println(subStr[i]);
        }
 return subStr;
    }

    public static boolean validHuman(Human human) {

        if (human.getLastName() != null & human.getFirstName() != null & human.getBirthDate() != null) {
            System.out.println("Массив валиден 1");
            return true;

        } else
            System.out.println("Массив невалиден 1");
        return false;


    }

    public static boolean validArrayHuman(Human[] human) {
        boolean valid = true;
        for (Human array : human) {
            if (array == null) {
                System.out.println("Массив заполнен");
                valid = false;
                break;
            } else System.out.println("Массив не заполнен");

        }
        return valid;
    }


}
