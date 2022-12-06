package _question3;

import java.util.Comparator;

public class duplicat implements Comparator<Student> {
    public int compare(Student s1,Student s2){
        return s1.getRoll()>s2.getRoll() ? +1:-1;
    }
}
