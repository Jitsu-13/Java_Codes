package _MultipleThread_using_Thread_extending;

public class ThreadB extends Thread {
    public void run(){
        for(int i=50;i<60;i++){
            System.out.println("Inside Thread B "+i);
        }
    }
}
