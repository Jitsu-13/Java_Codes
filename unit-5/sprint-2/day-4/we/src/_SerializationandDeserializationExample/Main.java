package _SerializationandDeserializationExample;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("two.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            ObjectOutputStream oos =new ObjectOutputStream(fos);
            List<Student> students=new ArrayList<>();
            students.add(new Student(10,"Ajit",999,30));
            students.add(new Student(12,"Neelmani",989,29));
            students.add(new Student(14,"Sujit",959,25));
            students.add(new Student(16,"Meera",979,22));
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
