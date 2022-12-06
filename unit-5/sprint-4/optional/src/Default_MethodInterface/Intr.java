package Default_MethodInterface;

public interface Intr {
    void method1();

    default void method2(){
        System.out.println("hello");
    }

    static void method3(){
        System.out.println("inside Method 3");
    }
}
