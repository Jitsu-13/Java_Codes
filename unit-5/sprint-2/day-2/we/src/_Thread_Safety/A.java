package _Thread_Safety;

public class A implements Runnable{
    public synchronized void fun1(){
        System.out.println("Welcome..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Admin");
    }
    public void run(){
        fun1();
    }
}
