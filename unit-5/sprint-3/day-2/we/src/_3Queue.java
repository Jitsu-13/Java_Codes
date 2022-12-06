import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _3Queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        //FIFO
        q.add(6);
        q.add(12);
        q.add(18);
        q.add(24);
        q.remove();
        List<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(12);
        q.removeAll(list);
        q.peek();
        q.clear();
        q.poll();
    }
}
