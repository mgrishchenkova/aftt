package lesson13.task3;

import java.util.Collections;
import java.util.List;

public class Functions {
    public static Func<Object, String> toStringFunction = Object::toString;
    public static Func<List<Integer>, Integer> summFunction = list -> {
        int sum = 0;
        for (Integer integer : list)
            sum = sum + integer;
        return sum;
    };
    public static Func<List<Object>, Boolean> onlyEqualsObjects = list -> {
        if (list.isEmpty()) return true;
        Object object = list.get(0);
        for (Object obj : list)
            if (!obj.equals(object))
                return false;
        return true;
    };
    public static final Func<List<Comparable>, Comparable> maxObject = list -> {
        Collections.sort(list);
        Collections.reverse(list);
        return list.get(0);
    };
}
