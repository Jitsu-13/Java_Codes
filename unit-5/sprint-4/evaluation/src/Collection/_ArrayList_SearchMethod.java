package Collection;

import java.util.ArrayList;

public class _ArrayList_SearchMethod {
    public static void main(String[] args) {
        ArrayList<Integer> a1 =new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        System.out.println(a1.contains(20));
        System.out.println(a1.contains(60));
    }
}
