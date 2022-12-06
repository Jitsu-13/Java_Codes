package Interface_prac;

public interface Intr {
    int X=10;
    void funX();
    void funY();

    default void funz(){
        System.out.println("Inside default method funZ of Intr");
    }
    static void fun1(){
        System.out.println("Inside static method fun1 of Intr");
    }
}
