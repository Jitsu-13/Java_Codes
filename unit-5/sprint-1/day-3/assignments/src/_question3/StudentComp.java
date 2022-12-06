package _question3;

import java.util.Comparator;
import java.util.Map;

public class StudentComp implements Comparator<Map.Entry<String,Student>>{
    public int compare(Map.Entry<String,Student> s1,Map.Entry<String,Student> s2){
        return s1.getValue().getName().compareTo(s2.getValue().getName());
    }
}
