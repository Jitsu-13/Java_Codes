package _MultipleThread_using_Thread_extending;

public class ThreadC extends Thread {
    public void run(){
        for(int i=20;i<30;i++){
            System.out.println("Inside Thread C "+i);
        }
    }
}
