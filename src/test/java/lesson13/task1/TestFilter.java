package lesson13.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFilter {
    @Test
    void testListFilters5(){
        List<Integer> listOutput=Arrays.asList(-20, 0, 4);
        List<Integer> listInput= Arrays.asList(-20, 0, 4, 5, 7, 9);
        Filter filter=integer -> integer<5;
        List<Integer> sortListMethods= FilterHelper.filters(listInput,filter);
        Assertions.assertEquals(sortListMethods,listOutput);


    }
    @Test
    void testListFilters10(){
        List<Integer> listOutput=Arrays.asList(15, 25);
        List<Integer> listInput= Arrays.asList(-20, 0, 4, 5, 7, 9, 10, 15, 25);
        Filter filter=integer -> integer>10;
        List<Integer> sortListMethods= FilterHelper.filters(listInput,filter);
        Assertions.assertEquals(sortListMethods,listOutput);
    }
    @Test
    void testListFiltersDis(){
        List<Integer> listOutput=Arrays.asList(-10, -7, -2, 4);
        List<Integer> listInput= Arrays.asList(-10, -7, 5, 15, 5, -2, 4, 15);
        Filter filter=integer -> listInput.indexOf(integer)==listInput.lastIndexOf(integer);
        List<Integer> sortListMethods= FilterHelper.filters(listInput,filter);
        Assertions.assertEquals(sortListMethods,listOutput);
    }
    @Test
    void testListFiltersCons(){
        List<Integer> listInput = Arrays.asList(-20, 0, 4, 5, 7, 9, 10, 15, 25);
        List<Integer> list1 =Arrays.asList(-20, 4, 9, 12, 15);
        List<Integer> output =Arrays.asList(-20, 4, 9, 15);
        Filter filter = value -> list1.contains(value);
        List<Integer> sortListMethods = FilterHelper.filters(listInput, filter);
        Assertions.assertEquals(sortListMethods, output);
    }
}
