package IProblem;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();
        students.add(new Student(10,"Aman",98));
        students.add(new Student(11,"Billo",96));
        students.add(new Student(12,"ChamakChallo",99));
        students.add(new Student(13,"DoodhWali",100));

        Collections.sort(students,(s1,s2)->{
            if(s1.getMarks()> s2.getMarks()){
                return 1;
            }else{
                return -1;
            }
        });
        System.out.println(students);

    }
}
