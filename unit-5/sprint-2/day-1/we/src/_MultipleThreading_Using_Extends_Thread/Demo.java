package _MultipleThreading_Using_Extends_Thread;

public class Demo extends Thread{
    public void run(){
        System.out.println("run starts");
        for(int i=11;i<20;i++){
            System.out.println("inside run "+i);
        }
        System.out.println("run ends");
    }

    public static void main(String[] args) {
        System.out.println("main starts");
        Demo d1=new Demo();
        d1.start();
        for(int i=0;i<10;i++){
            System.out.println("inside main "+i);
        }
        System.out.println("main ends");
    }
}
