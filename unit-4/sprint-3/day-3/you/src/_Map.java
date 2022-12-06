import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class _Map {
    public static void main(String[] args) {
//        HashMap<Integer,String> hm=new HashMap<>();
//        hm.put(1,"One");
//        hm.put(2,"Two");
//        hm.put(3,"One");
//        Set<Integer> set = hm.keySet();
//        System.out.println(set);
        /*for(Integer s:set){
            System.out.println(s);
        }*/
//        Collection<String> val =hm.values();
//        System.out.println(val);
//        System.out.println(hm); //
//        System.out.println(hm.size());//
//        Set<Map.Entry<Integer,String>> set1 =hm.entrySet();
//        System.out.println(set1);
//        for(Map.Entry<Integer,String> me:set1){
//            System.out.println(me.getKey()+"======"+me.getValue());
//        }
        HashMap<String,Student> hm=new HashMap<>();
        hm.put("Mumbai",new Student(10,"Ram",850));
        hm.put("Delhi",new Student(12,"Shyam",900));
        hm.put("Chennai",new Student(48,"Shrinu",950));

        Set<Map.Entry<String,Student>> set= hm.entrySet();
        for(Map.Entry<String,Student> me:set){
            System.out.println("City name is-"+me.getKey());
            System.out.println("==========================");
            Student student = me.getValue();
            System.out.println("Roll-"+student.getRoll());
            System.out.println("Name-"+student.getName());
            System.out.println("Marks-"+student.getMarks());
        }
    }
}
