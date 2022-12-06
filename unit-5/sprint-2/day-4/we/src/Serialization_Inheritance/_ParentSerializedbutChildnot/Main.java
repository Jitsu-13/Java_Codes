package Serialization_Inheritance._ParentSerializedbutChildnot;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Dog d =new Dog();
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("seven.txt"));
        oos.writeObject(d);
        oos.flush();
        oos.close();
        System.out.println("done");

    }
}
