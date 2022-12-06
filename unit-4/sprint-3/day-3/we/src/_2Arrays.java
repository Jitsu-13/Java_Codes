import java.util.Arrays;
import java.util.List;

public class _2Arrays {
    public static void main(String[] args) {
        int[] a={5,2,7,4,9,1};
        int[] b={6,2,4,4,6,1};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,7));
        System.out.println(Arrays.equals(a,b));
        List<Integer> list=Arrays.asList(1,2,3,5,6,8);
    }
}
