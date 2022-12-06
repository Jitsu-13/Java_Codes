package _MultiThreading_Using_MR;

public class Demo {
    public static void main(String[] args) {
        Thread tra=new Thread(A::print0to10);
        Thread trb =new Thread(A::print50to60);
        tra.setName("Willaimson");
        trb.setName("Jason");
        tra.start();
        trb.start();
    }
}
