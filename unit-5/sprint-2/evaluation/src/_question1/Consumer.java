package _question1;

public class Consumer extends Thread {
    Common c;
    int sum=0;
    public Consumer(Common c){
        this.c=c;
    }

    @Override
    public void run() {
        while(true){
            int i=c.consume();
            sum +=i;
            System.out.println("Sum is: "+sum);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
