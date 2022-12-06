package _MultipleThread_using_Thread_extending;

public class ThreadA extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Inside Thread _RunnigThreadonSameonSingleObject.A "+i);
        }
    }
}
