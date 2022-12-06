package _MultipleThread_using_Runnable_implements;

public class ThreadA implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Inside Thread _RunnigThreadonSameonSingleObject.A "+i);
        }
    }
}
