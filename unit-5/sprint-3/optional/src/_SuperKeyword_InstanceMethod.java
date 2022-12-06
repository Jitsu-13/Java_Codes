public class _SuperKeyword_InstanceMethod {
    public static void main(String[] args) {
        Dog5 d =new Dog5();
        d.work();
        d.eat();
        d.bark();
    }
}
class Animal5{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog5 extends Animal5{
    void eat(){
        System.out.println("eating bread....");
    }
    void bark(){
        System.out.println("barking...");
    }
    void work(){
        super.eat();
        bark();
    }
}
