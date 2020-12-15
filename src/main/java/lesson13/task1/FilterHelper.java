package lesson13.task1;

import java.util.ArrayList;
import java.util.List;

public class FilterHelper {
    public static List<Integer> filters(List<Integer> integer, Filter filter) {
        List<Integer> sortList = new ArrayList<>();
        if (integer == null) return null;
        for (Integer sort : integer) {
            if (filter.filter(sort)) {
                sortList.add(sort);
            }
        }
        return sortList;
    }
}
