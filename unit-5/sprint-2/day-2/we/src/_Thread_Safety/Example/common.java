package _Thread_Safety.Example;

public class common {
    public synchronized void fun1(String name){
        System.out.println("Welcome");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name);
    }
}
