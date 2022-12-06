package _Suspending_Thread_Conditionally;

public class Demo {
    public static void main(String[] args) {
        A a =new A();
        Thread tr1 =new Thread(a);
        tr1.start();
        try {
            tr1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result =a.sum;
        for(int i=0;i<5;i++){
            System.out.println("inisde main method");
            System.out.println(result);
        }
    }
}
