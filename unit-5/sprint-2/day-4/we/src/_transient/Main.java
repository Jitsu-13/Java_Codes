package _transient;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception{
        Student s1 =new Student(10,"Ajit",950,29);
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("one.txt"));
        oos.writeObject(s1);
        oos.flush();
        oos.close();
        System.out.println("Success");
    }
}
