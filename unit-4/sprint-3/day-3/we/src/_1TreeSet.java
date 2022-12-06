import java.util.Set;
import java.util.TreeSet;

public class _1TreeSet {
    public static void main(String[] args) {

        Set<Student> studentstreeSet=new TreeSet<>();
        studentstreeSet.add(new Student(50,"abc",90));
        studentstreeSet.add(new Student(51,"xyz",88));
        studentstreeSet.add(new Student(52,"lms",95));
        System.out.println(studentstreeSet);

        Set<Student> SortedstudentstreeSet=new TreeSet<>(new StudentMarksComparator());
        SortedstudentstreeSet.add(new Student(50,"abc",90));
        SortedstudentstreeSet.add(new Student(51,"xyz",88));
        SortedstudentstreeSet.add(new Student(52,"lms",95));
        System.out.println(SortedstudentstreeSet);
//        TreeSet<Integer> set=new TreeSet<>();
//        set.add(1);
//        set.add(5);
//        set.add(3);
//        set.add(9);
//        set.add(7);
//        Set<String> treeSet=new TreeSet<>();
//        treeSet.add("z");
//        treeSet.add("e");
//        treeSet.add("b");
//        System.out.println(treeSet);


    }
}
