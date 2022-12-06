package _question4;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.EnumMap;
import java.util.List;


public class Demo2 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("employeedata.txt"));
        try {
            List<Employee> ob=(List<Employee>) ois.readObject();
            ob.add(new Employee(108,"Pari",25000,"pari@gmail.com","@pari",new Address("HR","chandigarh","071256")));
            for(Employee s:ob){
                System.out.println(s.empId);
                System.out.println(s.empName);
                System.out.println(s.salary);
                System.out.println(s.email);
                System.out.println(s.password);
                System.out.println(s.address);
                System.out.println("-----------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
