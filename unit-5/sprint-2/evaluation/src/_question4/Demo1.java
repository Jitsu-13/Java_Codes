package _question4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(101,"Amit",15000,"amit@gmail.com","@amit",new Address("UP","Lucknow","000222")));
        list.add(new Employee(102,"Ananad",45000,"anand@gmail.com","@anand",new Address("HP","Shimla","00022")));
        list.add(new Employee(103,"Shilpa",25000,"shilpa@gmail.com","@shilpa",new Address("MP","Bhopal","001422")));
        list.add(new Employee(104,"Varun",35000,"varun@gmail.com","@varun",new Address("AP","Bengaluru","016222")));
        list.add(new Employee(105,"Tarun",65000,"tarun@gmail.com","@tarun",new Address("BH","Patna","024622")));

        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("employeedata.txt"));
        oos.writeObject(list);
        oos.close();
        System.out.println("Serialization is done");

    }
}
