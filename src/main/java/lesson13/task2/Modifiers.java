package lesson13.task2;

public class Modifiers {
    public static Modifier<Boolean> invert = value -> !value;
    public static Modifier<Integer> absolute = Math::abs;
    public static Modifier<String> reverse = string -> new StringBuilder(string).reverse().toString();
}
