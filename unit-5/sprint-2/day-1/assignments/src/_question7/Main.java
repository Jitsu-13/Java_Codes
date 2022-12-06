package _question7;

public class Main {
    public static void main(String[] args) {
        A a=new A();
        Thread tr1=new Thread(a);
        Thread tr2 =new Thread(a);
        tr1.setName("Dhoni");
        tr2.setName("Kholi");
        tr1.setPriority(8);
        tr2.setPriority(10);
        tr1.start();
        tr2.start();
    }
}
