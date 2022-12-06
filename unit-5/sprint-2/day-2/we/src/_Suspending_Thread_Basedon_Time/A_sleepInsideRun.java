package _Suspending_Thread_Basedon_Time;

public class A_sleepInsideRun implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" printing "+i);
        }
    }

    public static void main(String[] args) {
        A_sleepInsideRun b=new A_sleepInsideRun();
        Thread tr1=new Thread(b);
        tr1.setName("Dhoni");
        tr1.start();
        for(int i=90;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" printing "+i);
        }
    }
}
