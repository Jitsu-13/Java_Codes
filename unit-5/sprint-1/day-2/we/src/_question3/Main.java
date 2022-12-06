package _question3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students =new ArrayList<>();
        students.add(new Student(10,"A","Hell",900));
        students.add(new Student(15,"B","Wala",300));
        students.add(new Student(5,"C","Sala",450));
        students.add(new Student(25,"D","Kamla",600));
        students.add(new Student(20,"F","Vand",900));

        System.out.println(students);
        System.out.println("===================");
//        Set<Student> new_students =new TreeSet<>();
//        for(Student s:students){
//            new_students.add(s);
//        }
//        System.out.println(new_students);

        Collections.sort(students,(s1,s2)-> {
            if(s1.getMarks()>s2.getMarks()){
                return +1;
            }else if(s1.getMarks()==s2.getMarks()){
                return s1.getName().compareTo(s2.getName());
            }else{
                return -1;
            }
        });
        System.out.println(students);
    }
}
