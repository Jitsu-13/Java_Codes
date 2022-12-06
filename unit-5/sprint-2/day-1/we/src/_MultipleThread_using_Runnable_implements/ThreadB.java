package _MultipleThread_using_Runnable_implements;

public class ThreadB implements Runnable {
    public void run(){
        for(int i=50;i<60;i++){
            System.out.println("Inside Thread B "+i);
        }
    }
}
