package _question1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        A a=new A();
        a.start();
        synchronized (a) {
            a.wait();
            System.out.println(a.product);
        }
    }
}
