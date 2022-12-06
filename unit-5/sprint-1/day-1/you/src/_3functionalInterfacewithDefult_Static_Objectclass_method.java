interface Intr1{
    void sayHello(String name);
    boolean equals(Object obj);
    default void fun1(){
        System.out.println("Inside default method of fun1 of Intr1");
    }
    static void fun2(){
        System.out.println("Inside static method of fun2 of Intr1");
    }

}
class X2 implements Intr1{
    @Override
    public void sayHello(String name){
        System.out.println("Welcome: "+name);
    }
}

public class _3functionalInterfacewithDefult_Static_Objectclass_method {
    public static void main(String[] args) {
        Intr1 i1=new X2();
        i1.sayHello("Amit");
        i1.fun1();
        System.out.println(i1.equals(i1));
        Intr1.fun2();
    }
}
