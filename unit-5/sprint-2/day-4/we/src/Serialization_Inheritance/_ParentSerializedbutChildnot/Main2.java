package Serialization_Inheritance._ParentSerializedbutChildnot;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main2 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("seven.txt"));
        Dog a=(Dog)ois.readObject();
        System.out.println(a.i);
        System.out.println(a.j);
    }
}
