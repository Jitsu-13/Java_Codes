package _Serialization._1Example_Serializing;

import java.io.Serializable;

public class A implements Serializable {
    int i=10;
    public void funA(){
        System.out.println("inside funA() of A");
        System.out.println(i);
    }
}
