package _MultiThreading_Using_LE;

public class _multiThrading_1 {
    public static void main(String[] args) {
        Thread tra=new Thread(()->{
            for(int i=0;i<=10;i++){
                System.out.println(Thread.currentThread().getName()+" printing "+i);
            }
        });
        Thread trb=new Thread(()->{
            for(int i=11;i<=20;i++){
                System.out.println(Thread.currentThread().getName()+" printing "+i);
            }
        });
        tra.setName("Dhoni");
        trb.setName("Kholi");
        tra.start();
        trb.start();
    }
}
