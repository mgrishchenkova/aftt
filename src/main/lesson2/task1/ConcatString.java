package main.lesson2.task1;

public class ConcatString {
    public static void main(String[] args) {
        String[] stroka = {"Пятница", "это", "лучший", "день", "недели"};
        new ConcatString().CycleFor(stroka);
        new ConcatString().CycleForEach(stroka);
        new ConcatString().CycleWhile(stroka);

    }

    void CycleFor(String[] stroka) {
        String result = "";
        for (int i = 0; i < stroka.length; i++)
            result += stroka[i] + " ";
        System.out.print(result.trim() + ".");
    }
    void CycleForEach(String[] stroka) {
        String result = "";
        for ( String stroka1: stroka)
            result += stroka1 + " ";
        System.out.print(result.trim() + ".");
    }

    void CycleWhile(String[] stroka) {
        String result = "";
        int i=0;
        while ( i <stroka.length)
            result += stroka + " ";
        System.out.print(result.trim() + ".");
    }
}
