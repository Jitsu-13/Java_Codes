import java.util.HashMap;
import java.util.Map;

public class _3HashMap {
    public static void main(String[] args) {
        Map<String,Student> hm=new HashMap<>();
        hm.put("Mh",new Student(10,"ram",950));
        hm.put("TN",new Student(11,"def",900));
        hm.put("NH",new Student(12,"abd",850));
        System.out.println(hm.keySet());
        for(Student student:hm.values()){
            System.out.println(student);
        }
//        hm.forEach();
    }
}
