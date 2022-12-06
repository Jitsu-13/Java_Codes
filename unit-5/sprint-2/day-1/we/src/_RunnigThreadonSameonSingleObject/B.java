package _RunnigThreadonSameonSingleObject;

public class B implements Runnable{
    public void run(){
        for(int i=0;i<25;i++){
            System.out.println(Thread.currentThread().getName()+" : is running");
        }
    }
}
