package _question1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EvenNumbers eve =new EvenNumbers();
        OddNumbers odd =new OddNumbers();

        eve.start();
        eve.join();
        odd.start();
    }
}
