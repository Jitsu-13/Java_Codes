package Serialization_Inheritance._ChildSerializedbutParentnot;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        B b=new B();
        b.i=500;
        b.j=600;
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("ten.txt"));
        oos.writeObject(b);
        System.out.println("Serialo=ized the child Objext");
        System.out.println("After deserialization");
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("ten.txt"));
        B b2 = (B) ois.readObject();
        System.out.println(b2.i);
        System.out.println(b2.j);
    }
}
