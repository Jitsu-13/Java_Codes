package _MultiThreading_Using_MR;

public class Demo2 {
    public static void main(String[] args) {
        Thread tr1=new Thread(new B()::print0to10);
        Thread tr2=new Thread(new B()::print50to60);
        tr1.setName("Sujit");
        tr2.setName("Ajit");
        tr1.start();
        tr2.start();


    }
}
