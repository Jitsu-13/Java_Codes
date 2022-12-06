import java.util.TreeMap;

public class _7TreeExampleWeProblem {
    public static void main(String[] args) {
        TreeMap<String,Student> obj=new TreeMap (new StudentMarksComparator());
        obj.put("Mh",new Student(10,"Ganesh",950));
        obj.put("TN",new Student(11,"def",900));
        obj.put("NH",new Student(12,"abd",850));
        System.out.println(obj);
    }
}
