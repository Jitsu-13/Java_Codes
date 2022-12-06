package _Suspending_Thread_Conditionally;

public class A implements Runnable{
    int sum=0;
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("inside a Thread");
            sum+=i;
        }
    }
}
