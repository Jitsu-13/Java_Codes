public class _4ThisKeyword {
    // 'this' keyword point to current class object.
    // differentiate between local and instance variable.
    public static void main(String[] args) {
        Demo demo =new Demo();
        demo.fun1();
    }

}
class Demo{
    int x=100; // instance
    void fun1(){
        int x=500;
        System.out.println(x);
        System.out.println(this.x); // print x of current object
    }
}
