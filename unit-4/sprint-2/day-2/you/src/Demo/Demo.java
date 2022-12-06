public class Demo {
    int B=100;
    public static void main(String[] args) {
        System.out.println("Inside method of Demo");
        A a1=new A();
        System.out.println(a1.i);
        Demo d1 =new Demo();
        System.out.println(d1.B);
        a1.funA();

    }
}
