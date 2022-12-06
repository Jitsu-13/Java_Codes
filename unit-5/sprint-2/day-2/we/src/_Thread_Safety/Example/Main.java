package _Thread_Safety.Example;

public class Main {
    public static void main(String[] args) {
        common c=new common();
        ThreadA a=new ThreadA(c,"Ram");
        ThreadA b=new ThreadA(c,"Shyam");
        a.start();
        b.start();
    }
}
