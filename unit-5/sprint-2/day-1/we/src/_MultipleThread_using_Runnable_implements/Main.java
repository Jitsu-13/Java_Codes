package _MultipleThread_using_Runnable_implements;

public class Main {

    public static void main(String[] args) {

        ThreadA ta=new ThreadA();
        ThreadB tb=new ThreadB();
        ThreadC tc=new ThreadC();
        Thread tra=new Thread(ta);
        Thread trb=new Thread(tb);
        Thread trc=new Thread(tc);
        tra.start();
        trb.start();
        trc.start();

        for(int i=90;i<101;i++){
            System.out.println("Inside main "+i);
        }
    }
}
