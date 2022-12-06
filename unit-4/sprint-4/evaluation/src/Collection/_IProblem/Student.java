package Collection._IProblem;

public class Student {
    private int roll;
    private String name;
    private int marks;

    public Student(){
    }
    public Student(int roll,String name,int marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    public int getRoll(){
        return roll;
    }
    public void setRoll(int roll){
        this.roll=roll;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }

//    public static void main(String[] args) {
//        Student s1=new Student(10,"Ram",500);
//        Student s2=new Student(10,"Ram",500);
////        System.out.println(s1.equals(s2));
//    }
}
