package _transient;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main2 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("one.txt"));
        Student s1=(Student)ois.readObject();
        System.out.println(s1);
        ois.close();

    }
}
