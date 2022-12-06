package _Suspending_Thread_Conditionally.Another_Example;

public class ThreadA extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" printing "+i);
        }
    }
}
