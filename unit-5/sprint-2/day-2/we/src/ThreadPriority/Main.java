package ThreadPriority;

public class Main implements Runnable {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("The priority of"+" "+Thread.currentThread().getName()+" is "+Thread.currentThread().getPriority()
            );
        }
    }

    public static void main(String[] args) {
        Main t1=new Main();
        Thread a =new Thread(t1);
        Thread b =new Thread(t1);
        Thread c =new Thread(t1);
        a.setName("Kohli");
        b.setName("Dhoni");
        c.setName("Rohit");
        a.setPriority(10);
        b.setPriority(Thread.MIN_PRIORITY);
        c.setPriority(7);
        a.start();
        b.start();
        c.start();
    }
}
