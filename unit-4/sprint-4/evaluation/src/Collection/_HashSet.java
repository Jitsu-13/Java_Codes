package Collection;

import java.util.HashSet;

public class _HashSet {
    public static void main(String[] args) {
        HashSet<String> hs =new HashSet<>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Chennai");
        hs.add("Pune");
        hs.add("Delhi");
        hs.add(null);
        hs.add("Bengaluru");
        System.out.println(hs);
        for(String s:hs){
            System.out.println(s);
        }
    }
}
