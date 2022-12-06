package _MultiThreading_Using_MR;

public class B {
    public void print0to10(){
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" printing "+i);
        }
    }
    public void print50to60(){
        for(int i=50;i<=60;i++){
            System.out.println(Thread.currentThread().getName()+" printing "+i);
        }
    }
}
