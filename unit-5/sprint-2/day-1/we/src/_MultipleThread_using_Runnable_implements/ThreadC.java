package _MultipleThread_using_Runnable_implements;

public class ThreadC implements Runnable {
    public void run(){
        for(int i=20;i<30;i++){
            System.out.println("Inside Thread C "+i);
        }
    }
}
