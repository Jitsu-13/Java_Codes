package _settingNameofThread;

public class ThreadB implements Runnable {
    public void run(){
        for(int i=50;i<60;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
