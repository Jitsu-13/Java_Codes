package Map_Arrays_Collectionsclasses_Iterator_Generics_Queue_PriorityQueue._CollectionClass;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class _Sorting {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,15,27,3,56,12,79,5);
        System.out.println("Before Sorting List "+list);
        Collections.sort(list);
        System.out.println("After Sorting List "+list);
        Collections.reverse(list);
        System.out.println("After reversing List "+list);
    }
}
