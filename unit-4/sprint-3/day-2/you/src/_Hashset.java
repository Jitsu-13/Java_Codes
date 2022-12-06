import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class _Hashset {
    public static void main(String[] args) {
        /*HashSet<String> hs=new HashSet<>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Chennai");
        hs.add("Kolkata");
        hs.add("Mysore");
        hs.add("Bengaluru");
//        hs.add("Chennai"); -duplicate not allowed
        System.out.println(hs);
        System.out.println(hs.size());*/

        LinkedHashSet<String> hs=new LinkedHashSet<>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Chennai");
        hs.add("Kolkata");
        hs.add("Mysore");
        hs.add("Bengaluru");
//        hs.add("Chennai"); -duplicate not allowed
        System.out.println(hs);
        System.out.println(hs.size());
    }
}
