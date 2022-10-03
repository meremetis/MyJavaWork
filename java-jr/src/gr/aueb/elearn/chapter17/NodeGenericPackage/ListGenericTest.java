package gr.aueb.elearn.chapter17.NodeGenericPackage;

import java.util.Arrays;
import java.util.List;

public class ListGenericTest {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3 ,4 ,5);
        var strList = Arrays.asList("car", "cat", "Camel");
        Integer[] intArr = {1,2,3};



    }

    public static void print(List<?> list)
    {
        list.forEach(System.out::println);
    }

    public static<T> void print (T[] arr)
    {
        for (T arrayItem : arr)
        {
            System.out.println(arrayItem);
        }
    }
}
