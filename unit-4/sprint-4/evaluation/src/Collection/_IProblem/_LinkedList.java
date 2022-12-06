package Collection._IProblem;

import java.util.LinkedList;

public class _LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(2,60);
        list.remove(3);
        System.out.println(list);
    }
}
