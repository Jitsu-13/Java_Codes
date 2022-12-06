package _SynchronizedBlock_IProblem;

public class Counter implements Runnable {
    private int c=0;
    public void increment(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c++;
    }
    public void decrement(){
        c--;
    }
    public int getValue(){
        return c;
    }

    @Override
    public void run() {
        synchronized (this) {
            this.increment();
            System.out.println("Value for Thread After increment " + Thread.currentThread().getName() + " " + this.getValue());

            this.decrement();
            System.out.println("Value for Thread After decrement " + Thread.currentThread().getName() + " " + this.getValue());
        }
    }
}
