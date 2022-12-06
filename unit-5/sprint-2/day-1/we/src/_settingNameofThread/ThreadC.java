package _settingNameofThread;

public class ThreadC implements Runnable {
    public void run(){
        for(int i=20;i<30;i++){
//            String name =Thread.currentThread().getName();
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
