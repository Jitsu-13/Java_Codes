package Collection;

import java.util.ArrayList;

public class _ArrayList_converttoArray {
    public static void main(String[] args) {
        ArrayList<Integer> a1 =new ArrayList<>();
        a1.add(10);
        a1.add(30);
        a1.add(50);
        a1.add(70);
        a1.add(90);

        Object[] arr =a1.toArray();
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        for(Object a:arr){
            int x =(Integer)a;
            System.out.println(x);
        }
    }
}
