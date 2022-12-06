import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class _ArrayList {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("c");
        al.add("D");
        /*al.set(1,"hel");
        System.out.println(al);
        System.out.println(al.size());*/
//        System.out.println(al.set(1,"hel"));
        // Normal For loop
        /*
        for(int i=0;i<al.size();i++){
            String s1=al.get(i);
            System.out.println(s1.toLowerCase());
        }
        */
        // Enhanced for loop
        /*for(String s:al){
            System.out.println(s);
        }*/
        // Iterator
        Iterator<String> itr= al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
