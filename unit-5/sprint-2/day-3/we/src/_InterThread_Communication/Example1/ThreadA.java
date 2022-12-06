package _InterThread_Communication.Example1;

public class ThreadA extends Thread{
    int total=0;

    @Override
    public void run() {

        synchronized (this){
            for(int i=0;i<100;i++){
                total +=i;
            }
            this.notify();
        }

    }
}
