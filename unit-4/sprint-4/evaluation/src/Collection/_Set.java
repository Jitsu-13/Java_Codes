package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class _Set {
    public static void main(String[] args) {
        Set<Integer> s1 =new HashSet<>();
        Set<Integer> s2 =new LinkedHashSet<>();
        Set<Integer> s3 =new TreeSet<>();
        s1.add(1);
        s2.add(2);
        s3.add(3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
