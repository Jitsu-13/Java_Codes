package _InterThread_Communication.Example1;

public class Main {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.start();

        synchronized (a){
            try {
                a.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(a.total);
        }
//        try {
//            a.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}
