package Collection._IProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        int count=1;
        while(true){
            System.out.println("Enter the details of student "+(count++));
            System.out.println("Enter Roll");
            int roll = sc.nextInt();
            System.out.println("Enter Name");
            String name =sc.next();
            System.out.println("Enter Marks");
            int marks =sc.nextInt();
            Student student = new Student(roll,name,marks);
            students.add(student);
            System.out.println("want More (y/n) ?");
            String choice =sc.next();
            if(choice.equalsIgnoreCase("n")){
                break;
            }
        }
        System.out.println("Printing details of all student");
        System.out.println("===============================");
        for(Student s:students){
            System.out.println("Roll is :"+s.getRoll());
            System.out.println("Name is :"+s.getName());
            System.out.println("Marks is :"+s.getMarks());
            System.out.println("=======================");
        }

    }
}
