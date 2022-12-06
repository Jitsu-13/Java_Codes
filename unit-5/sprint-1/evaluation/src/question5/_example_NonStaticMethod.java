package question5;

public class _example_NonStaticMethod {
    public void fun2(String s){
        System.out.println("Welcome to "+s);
    }

    public static void main(String[] args) {
        _example_NonStaticMethod d1=new _example_NonStaticMethod();
        Intr a2= d1::fun2;
        a2.country("Pakistan");
    }
}
