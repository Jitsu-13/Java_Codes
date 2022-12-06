package Map_Arrays_Collectionsclasses_Iterator_Generics_Queue_PriorityQueue._IProblem;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Student> students =new ArrayList<>();
        students.add(new Student(10,"name1",850));
        students.add(new Student(11,"name2",450));
        students.add(new Student(12,"name3",950));
        students.add(new Student(13,"name4",550));
        students.add(new Student(14,"name5",650));
        Collections.sort(students,new StudentMarksComp());

        for(Student student:students){
            System.out.println("Roll :"+student.getRoll());
            System.out.println("Name :"+student.getName());
            System.out.println("Marks :"+student.getMarks());
            System.out.println("==============================");
        }
    }
}
