package _Objectgraph;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Dog d =new Dog();
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("four.txt"));
        oos.writeObject(d);
        oos.flush();
        oos.close();
        System.out.println("done");
    }

}
