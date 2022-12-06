package _question2;

import java.util.Comparator;

public class Myaddress implements Comparator<Employee> {
    public int compare(Employee e1,Employee e2){
        return e1.getAddress().compareTo(e2.getAddress());
    }
}
