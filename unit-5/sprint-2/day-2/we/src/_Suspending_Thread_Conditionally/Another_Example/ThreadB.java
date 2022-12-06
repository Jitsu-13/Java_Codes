package _Suspending_Thread_Conditionally.Another_Example;

public class ThreadB extends Thread{
    Thread t;
    ThreadB(Thread t){
        this.t=t;
    }
    @Override
    public void run() {
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" printing "+i);
        }
    }
}
