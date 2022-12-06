package _InterThread_Communication.Example2;

import _InterThread_Communication.Example1.ThreadA;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        myThread mt =new myThread();
        mt.start();
        Thread.sleep(1000);
        synchronized (mt){
            System.out.println("main thread calls the wait method");
            mt.wait(5000);
            System.out.println("main thread got the notification");
            System.out.println(mt.num);
        }
    }
}
