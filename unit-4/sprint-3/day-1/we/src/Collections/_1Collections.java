package Collections;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class _1Collections {
    public static void main(String[] args) {
        int[] a =new int[10];
        List<Integer> integerList=new ArrayList<>(50);
        integerList.add(1);
        integerList.add(2);
        integerList.size();
        integerList.toArray();
        integerList.remove(3);
        integerList.contains(20);
        //1.
        for(int i=0;i<integerList.size();i++){
            System.out.println(integerList.get(i));
        }
        //2.
        for(Integer loopVariableName:integerList){
            System.out.println(loopVariableName);
        }
        //3.
        integerList.forEach(loopVaraibleName-> System.out.println(loopVaraibleName));
        //4.
        Iterator<Integer> integerIterator= integerList.listIterator();
        while(integerIterator.hasNext())
            integerIterator.next();
    }
}
