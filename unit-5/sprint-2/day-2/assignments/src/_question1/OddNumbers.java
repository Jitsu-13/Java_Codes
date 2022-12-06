package _question1;

public class OddNumbers extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=20;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+"odd numbers is "+i);
            }
        }
    }
}
