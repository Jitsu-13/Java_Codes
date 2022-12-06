package Map_Arrays_Collectionsclasses_Iterator_Generics_Queue_PriorityQueue._IProblem;

import java.util.Comparator;

public class StudentMarksComp implements Comparator<Student> {
    @Override
    public int compare(Student s1,Student s2){
        if(s1.getMarks()>s2.getMarks()){
            return +1;
        } else if(s1.getMarks()<s2.getMarks()){
            return -1;
        }else{
            return 0;
        }
    }
}
