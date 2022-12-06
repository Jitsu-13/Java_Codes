package _question3;

public class Rohit extends Thread{

    public void run() {
        int product=1;
        for(int i=1;i<=10;i++){
            product *=i;
        }
        System.out.println(Thread.currentThread().getName()+" Product of  first 10 numbers is "+product);
    }
}
