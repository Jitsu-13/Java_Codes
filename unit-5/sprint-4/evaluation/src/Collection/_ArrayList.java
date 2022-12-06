package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class _ArrayList {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("one");
        a1.add("two");
        a1.add("three");
        a1.add("one");
        a1.add("null");
        a1.add("four");
        a1.add(2,"eight");
        a1.remove(3);
        System.out.println(a1);
        System.out.println(a1.size());
        // Noraml for-Loop
        /*
        for(int i=0;i<a1.size();i++){
            System.out.println(a1.get(i));
        }
        */
        // Enhanced forLoop
        /*
        for(String s:a1){
            System.out.println(s);
        }
        */
        // USing Iterator
//        Iterator<String> itr =a1.iterator();
//        while(itr.hasNext()){
//            String s = itr.next();
//            System.out.println(s);
//        }
    }

}
