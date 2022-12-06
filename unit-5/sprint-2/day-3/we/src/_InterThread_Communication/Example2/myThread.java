package _InterThread_Communication.Example2;


public class myThread extends Thread {
    int num=0;
    @Override
    public void run(){
        synchronized (this) {
            System.out.println("child thread performing calculation");
            for (int i = 0; i <= 100; i++) {
                num = num + i;
            }
            System.out.println("child is giving the notification");
            this.notify();
        }
    }
}
