package _question1;

public class Producer extends Thread{
    Common c;
    public Producer(Common c){
        this.c=c;
    }

    @Override
    public void run() {
        int i=0;
        while(true){
            c.produce(i);
            i=i+1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
