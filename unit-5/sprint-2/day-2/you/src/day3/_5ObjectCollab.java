package day3;

public class _5ObjectCollab {
    public static void main(String[] args) {
        Student student =new Student();
        student.age=10;
        Address addressOfStudent= new Address();
        addressOfStudent.city="BLR";
        addressOfStudent.country="India";
        student.studentAddress=addressOfStudent ;
        System.out.println(student.studentAddress.city);
    }
}
class Student{
    String name;
    int age;
    //composition: one object is made of another object
    Address studentAddress;
}
class Address{
    String city;
    String country;
}
class Employee{
    String empId;
    Address employeeAddress;
}