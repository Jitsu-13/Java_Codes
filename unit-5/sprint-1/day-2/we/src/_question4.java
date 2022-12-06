import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _question4 {
    public static void main(String[] args) {
        List<String> cities= Arrays.asList("Mumbai","Gurgaon","Chennai","Sydney","Paris","London","New York");
        System.out.println(cities);
        System.out.println("=========================");

        Collections.sort(cities,(c1,c2)->c1.compareTo(c2));
        System.out.println(cities);
    }
}
