interface Intr7{
    void sayHello(String name);
}
public class _9LambaExpressionfromAMethod {

    public static Intr7 fun1(){
        return n-> System.out.println("Welcome "+n);
    }
    public static void main(String[] args) {
        Intr7 i1=fun1();
        i1.sayHello("Admin");
    }
}
