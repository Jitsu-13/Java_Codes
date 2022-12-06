package _Serialization._1Example_Serializing;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis =new FileInputStream("d://dummy/six.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object obj=ois.readObject();
        A a1=(A)obj;
        a1.funA();
        String ss =(String)ois.readObject();
        System.out.println(ss);
        int z =(Integer)ois.readObject();
        System.out.println(z);
        ois.close();
    }
}
