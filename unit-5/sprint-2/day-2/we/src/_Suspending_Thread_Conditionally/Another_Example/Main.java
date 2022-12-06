package _Suspending_Thread_Conditionally.Another_Example;

public class Main {
    public static void main(String[] args) {
        ThreadA a=new ThreadA();
        ThreadB b=new ThreadB(a
        );
        a.setName("Dhoni");
        b.setName("kholi");
        a.start();
        b.start();
    }
}
