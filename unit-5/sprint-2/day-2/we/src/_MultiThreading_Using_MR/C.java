package _MultiThreading_Using_MR;

public class C {
    void sayHello() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " printing " + i);
        }
    }
    void Bye() {
        for (int i = 50; i <= 60; i++) {
            System.out.println(Thread.currentThread().getName() + " printing " + i);
        }
    }

}
