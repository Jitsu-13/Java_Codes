package _question3;

public class Virat extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int sum=0;
        for(int i=1;i<=20;i++){
            sum +=i;
        }
        System.out.println(Thread.currentThread().getName()+" Sum of  first 20 numbers is "+sum);
    }
}
