package Collection.WeProblme;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> students =new HashSet<>();
        students.add(new Student(10,"ram",500));
        students.add(new Student(12,"Vishnu",600));
        students.add(new Student(10,"ram",500)); //duplicate object
        students.add(new Student(14,"Srinu",600));
        System.out.println(students.size());
        System.out.println(students);
    }
}
