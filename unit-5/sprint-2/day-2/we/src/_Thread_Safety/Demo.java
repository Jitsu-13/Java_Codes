package _Thread_Safety;

public class Demo {
    public static void main(String[] args) {
        A a= new A();
        Thread tr1 =new Thread(a);
        Thread tr2=new Thread(a);
        tr1.start();
        tr2.start();
    }


}
