package question5;

public class _example_StaticMethod {
    public static void fun1(String n){
        System.out.println("Inside "+n);
    }
    public static void main(String[] args) {
        Intr a1 =_example_StaticMethod::fun1;
        a1.country("India");
    }
}
