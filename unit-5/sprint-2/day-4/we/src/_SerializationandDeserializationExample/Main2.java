package _SerializationandDeserializationExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Main2 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis =new FileInputStream("two.txt");
        ObjectInputStream ois =new ObjectInputStream(fis);
        List<Student> list=(List<Student>) ois.readObject();
        list.forEach(s-> {
            System.out.println(s);
            System.out.println("--------------------");
        });
        list.add(new Student(18, "Daisy", 1000, 5));
        System.out.println("-------adding new element-----------");
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("two.txt"));
        oos.writeObject(list);


    }
}
