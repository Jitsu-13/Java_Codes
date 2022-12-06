package _question1;

public class A extends Thread{
    int product=1;
    @Override
    public void run() {
        synchronized (this){
            for(int i=1;i<=10;i++){
                product *=i;
            }
            this.notify();
        }

    }
}
