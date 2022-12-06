package _MutluThreading_Using_SingleObject;

public class Demo {
    public static void main(String[] args) {
        A a=new A();
        Thread one =new Thread(a);
        Thread two =new Thread(a);
        one.setName("Kohli");
        two.setName("Dhoni");
        one.start();
        two.start();
    }
}
