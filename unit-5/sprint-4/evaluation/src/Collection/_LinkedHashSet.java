package Collection;

import java.util.LinkedHashSet;

public class _LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> hs =new LinkedHashSet<>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Chennai");
        hs.add("Pune");
        hs.add("Delhi");
        hs.add(null);
        hs.add("Bengaluru");
        System.out.println(hs);
    }
}
