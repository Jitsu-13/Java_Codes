package Collection.WeProblme;

public class Student {
    private int roll;
    private String name;
    private int marks;

    public Student() {
    }

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        Student s1=this;
        Student s2=(Student)o;
        return s1.roll==s2.roll && s1.marks==s2.marks && s1.name.equals(s2.name);
    }
    @Override
    public int hashCode(){
        return roll;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
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
    @Override
    public String toString(){
        return "Student{"+
                "roll="+roll+
                " name="+ name+'\''+
                " marks="+marks+
                '}';
    }
}
