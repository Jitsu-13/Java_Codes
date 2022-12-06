package _question1;

public class Main {
    public static void main(String[] args) {
        Common c =new Common();
        Producer prod=new Producer(c);
        Consumer cons =new Consumer(c);
        prod.start();
        cons.start();
    }
}
