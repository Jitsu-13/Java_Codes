package _question3;

import java.util.*;

public class Main {
    public static Map<String,Student> sortByMapValue(Map<String,Student> map){
        Set<Map.Entry<String,Student>> set=map.entrySet();
        Set<Map.Entry<String,Student>> sortedMap=new TreeSet<>(new StudentComp());
        sortedMap.addAll(set);
        Map<String,Student> finalMap =new LinkedHashMap<>();
        for(Map.Entry<String,Student> s:sortedMap){
            finalMap.put(s.getKey(),s.getValue());
        }
        return finalMap;
    };
    public static void main(String[] args) {
        Map<String,Student> map=new HashMap<>();
        map.put("India",new Student(10,"B","a@gmail.com",700));
        map.put("England",new Student(11,"C","b@gmail.com",400));
        map.put("Pakistan",new Student(12,"A","c@gmail.com",900));
        map.put("UAE",new Student(13,"D","d@gmail.com",200));
        map.put("Newzeland",new Student(14,"F","e@gmail.com",800));
//        System.out.println(map);
//        System.out.println("===============================================");

        Map<String,Student> sortedMap=sortByMapValue(map);
//        System.out.println(sortedMap);

        for(Map.Entry<String, Student> s: sortedMap.entrySet()) {

            System.out.println("Student is from: "+s.getKey());
            System.out.println("---------------------------------");
            Student stu = s.getValue();

            System.out.println("Student Name: "+stu.getName());
            System.out.println("Student RollNo: "+stu.getRoll());
            System.out.println("Student Marks: "+stu.getMarks());
            System.out.println("------------------------------------");
        }



    }
}