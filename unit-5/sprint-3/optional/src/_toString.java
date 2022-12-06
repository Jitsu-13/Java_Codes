public class _toString {
    public static void main(String[] args) {
       Student4 s1 =new Student4(101,"Raj","Lucknow");
       Student4 s2 =new Student4(102,"Vijay","Ghaziabad");
        System.out.println(s1);
        System.out.println(s2);
    }
}
class Student4{
    int rollno;
    String name;
    String city;
    Student4(int rollno,String name,String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }

    @Override
    public String toString(){
        return rollno+" "+name+" "+city;
    }
}
