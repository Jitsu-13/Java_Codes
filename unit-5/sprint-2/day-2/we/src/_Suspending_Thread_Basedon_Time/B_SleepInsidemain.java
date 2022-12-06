package _Suspending_Thread_Basedon_Time;

public class B_SleepInsidemain extends Thread {
    @Override
    public void run() {
        for(int i=10;i<20;i++){
            System.out.println(Thread.currentThread().getName()+" printing "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        B_SleepInsidemain b=new B_SleepInsidemain();
        b.setName("King Kholi");
        b.start();

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        for(int i=99;i<109;i++){
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" printing "+i);
        }
    }
}
