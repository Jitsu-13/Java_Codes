interface Intr4{
//    void sayHello(String name);
//    void sayHello();
//    void add(int num1,int num2);
    int add(int num1,int num2);
}


public class _5functionlnterface_UsingLamdaExpression {

    public static void main(String[] args) {
        Intr4 i1=(n1,n2)->n1+n2;
        System.out.println(i1.add(50,20));
//        Intr4 i1=()->{
//            System.out.println("Welcome Sujit");
//        };
//        i1.sayHello();
    }
}
