package _Thread_Safety.Example;

public class ThreadB extends Thread {
    common c;
    String name;
    ThreadB(common c, String name){
        this.c=c;
        this.name=name;
    }
    @Override
    public void run(){
        c.fun1(name);
    }
}
