package _question2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number between 1 and 3");
        int N=sc.nextInt();
        if(N==1) {
            Set<Employee> set = new TreeSet<>(new MyempId());
            set.add(new Employee(1, "Aman", "Bombay", 50000));
            set.add(new Employee(2, "Chameli", "Bareli", 90000));
            set.add(new Employee(30, "Bimla", "Lucknow", 30000));
            set.add(new Employee(14, "Durga", "Goregaon", 85000));
            set.add(new Employee(50, "Elvin", "Valsad", 60000));
            set.add(new Employee(6, "Farhan", "Tripura", 75000));
            System.out.println(set);
        }else if(N==2){
            Set<Employee> set = new TreeSet<>(new Myaddress());
            set.add(new Employee(1, "Aman", "Bombay", 50000));
            set.add(new Employee(2, "Chameli", "Bareli", 90000));
            set.add(new Employee(30, "Bimla", "Lucknow", 30000));
            set.add(new Employee(14, "Durga", "Goregaon", 85000));
            set.add(new Employee(50, "Elvin", "Valsad", 60000));
            set.add(new Employee(6, "Farhan", "Tripura", 75000));
            System.out.println(set);
        }else{
            Set<Employee> set = new TreeSet<>(new Mysalary());
            set.add(new Employee(1, "Aman", "Bombay", 50000));
            set.add(new Employee(2, "Chameli", "Bareli", 90000));
            set.add(new Employee(30, "Bimla", "Lucknow", 30000));
            set.add(new Employee(14, "Durga", "Goregaon", 50000));
            set.add(new Employee(50, "Elvin", "Valsad", 60000));
            set.add(new Employee(6, "Farhan", "Tripura", 75000));
            System.out.println(set);
        }
    }
}
