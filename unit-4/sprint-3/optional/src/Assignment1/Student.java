package Assignment1;

import java.util.Scanner;

public class Student {
    public int roll;
    public String name;
    public String address;
    public int marks;

    Student(int roll, String name, String address, int marks) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }

    void printDetails(){
        System.out.println("Roll is :"+roll+" Name is :"+name+" Address is :"+address+" Marks is :"+marks);
    }
    int sum=0;


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many student object need to be created");
        int N= s.nextInt();
        Student[] students=new Student[N];
        for(int i=0;i<N;i++){
            System.out.println("Enter roll no");
            int roll=s.nextInt();
            System.out.println("Enter Name");
            String name=s.next();
            System.out.println("Enter Address");
            String address=s.next();
            System.out.println("Enter Marks");
            int marks=s.nextInt();
            students[i]=new Student(roll,name,address,marks);
        }
        int sum=0;
        for(Student student:students){
            student.printDetails();
            sum += student.marks;
        }
        System.out.println(sum/N);
    }
}

