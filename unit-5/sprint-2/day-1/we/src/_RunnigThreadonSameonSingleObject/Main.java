package _RunnigThreadonSameonSingleObject;

public class Main {
    public static void main(String[] args) {
//        A a=new A();
//        B b=new B();
        A job =new A();


        Thread ta=new Thread(job);
        Thread tb=new Thread(job);
        ta.setName("Mutu");
        tb.setName("Swami");
        ta.start();
        tb.start();
    }
}
