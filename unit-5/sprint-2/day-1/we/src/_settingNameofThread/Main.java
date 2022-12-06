package _settingNameofThread;

public class Main {

    public static void main(String[] args) {

        ThreadA ta=new ThreadA();
        ThreadB tb=new ThreadB();
        ThreadC tc=new ThreadC();
        Thread tra=new Thread(ta);
        Thread trb=new Thread(tb);
        Thread trc=new Thread(tc);
        tra.setName("Kohli");
        trb.setName("Rohit");
        trc.setName("Surya");
        tra.start();
        trb.start();
        trc.start();
        Thread.currentThread().setName("Dhoni");
        for(int i=90;i<101;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
