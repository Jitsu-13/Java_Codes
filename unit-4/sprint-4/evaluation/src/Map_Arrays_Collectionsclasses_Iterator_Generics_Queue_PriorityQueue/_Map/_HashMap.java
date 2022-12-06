package Map_Arrays_Collectionsclasses_Iterator_Generics_Queue_PriorityQueue._Map;

import java.util.HashMap;

public class _HashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm =new HashMap<>();
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");
        hm.put(4,"four");
        System.out.println(hm);
        hm.put(null,"four");
        hm.put(null,"four");
        hm.put(2,"Two");
        hm.put(5,"null");
        hm.put(6,"null");
        System.out.println(hm);
        System.out.println(hm.size());
    }
}
