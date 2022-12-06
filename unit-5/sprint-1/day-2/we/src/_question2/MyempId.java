package _question2;

import java.util.Comparator;

public class MyempId implements Comparator<Employee> {
    public int compare(Employee e1,Employee e2){
        return e1.getEmpId()>= e2.getEmpId() ? 1:-1;
    }
}
