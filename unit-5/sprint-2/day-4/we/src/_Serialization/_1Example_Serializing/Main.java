package _Serialization._1Example_Serializing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        A a1 =new A();
        a1.i=22;
        FileOutputStream fos =new FileOutputStream("d://dummy/six.txt");
        ObjectOutputStream oos =new ObjectOutputStream(fos);
        oos.writeObject(a1);
        oos.writeObject("Hello");
        oos.writeObject(20);
        oos.flush();
        oos.close();
    }
}
