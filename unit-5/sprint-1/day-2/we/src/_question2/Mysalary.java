package _question2;

import java.util.Comparator;

public class Mysalary implements Comparator<Employee> {
    public int compare(Employee e1,Employee e2){
        if(e1.getSalary()>e2.getSalary()){
            return 1;
        }else if(e1.getSalary()>e2.getSalary()){
            return e1.getEmpName().compareTo(e2.getEmpName());
        }else{
            return -1;
        }
    }
}
