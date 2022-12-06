package _MultipleThread_using_Thread_extending;

public class Main {

    public static void main(String[] args) {

        ThreadA ta=new ThreadA();
        ThreadB tb=new ThreadB();
        ThreadC tc=new ThreadC();
        ta.start();
        tb.start();
        tc.start();

        for(int i=90;i<101;i++){
            System.out.println("Inside main "+i);
        }
    }
}
