class Student{
    int roll;
    String name;
    int marks;
    Student(int roll,String name,int marks){
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
interface Intr5{
    void printDetails(Student student);
}
public class _6Example6 {
    public static void main(String[] args) {
        Intr5 i1=(s)->{
            System.out.println("Roll "+s.getRoll());
            System.out.println("Name "+s.getName());
            System.out.println("Marks "+s.getMarks());
        };
        i1.printDetails(new Student(10,"Ram",99));
    }
}
