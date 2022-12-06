package Map_Arrays_Collectionsclasses_Iterator_Generics_Queue_PriorityQueue._Map;

import java.util.*;

public class _MapIterator {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
        hm.put(4, "four");

        System.out.println("Getting all the keys");
        Set<Integer> keys =hm.keySet();
        for(Integer x:keys){
            System.out.println(x);
        }
        System.out.println("getting all the value");
        Collection<String> values =hm.values();
        for(String value:values){
            System.out.println(value);
        }
        System.out.println("Getting both keys and values");
        Set<Map.Entry<Integer,String>> keyvalue=hm.entrySet();
        for(Map.Entry<Integer,String> me:keyvalue){
            System.out.println(me.getKey()+"=>"+me.getValue());
        }
    }
}
